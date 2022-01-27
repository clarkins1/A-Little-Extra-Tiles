package com.alet.client.gui.controls.programmer.blueprints;

import java.util.ArrayList;
import java.util.List;

import com.alet.client.gui.controls.GuiDragablePanel;
import com.alet.client.gui.controls.programmer.BluePrintNode;
import com.creativemd.creativecore.common.gui.GuiRenderHelper;
import com.creativemd.creativecore.common.gui.client.style.Style;
import com.creativemd.creativecore.common.gui.container.GuiParent;
import com.creativemd.creativecore.common.utils.mc.ColorUtils;

public abstract class GuiBluePrint extends GuiParent {
	
	public String title;
	private List<BluePrintNode> nodes = new ArrayList<BluePrintNode>();
	public boolean selected = false;
	
	public GuiBluePrint(String name, String title, int x, int y) {
		super(name, x, y, 0, 0);
		this.title = title;
		this.width = font.getStringWidth(title) + 25;
		this.createControls();
	}
	
	public abstract void createControls();
	
	public void addNode(BluePrintNode node) {
		boolean hasNode = has(node.name);
		
		if (!hasNode) {
			this.nodes.add(node);
			this.addControl(node);
			setWidth();
			height += 13;
		}
	}
	
	public void setWidth() {
		int maxReturn = 0;
		int maxParam = 0;
		for (BluePrintNode node : this.nodes) {
			maxParam = Math.max(maxParam, font.getStringWidth(node.title));
			maxReturn = Math.max(maxReturn, font.getStringWidth(node.title));
		}
		int finalWidth = Math.max(this.width, maxParam + maxReturn + 40);
		this.width = finalWidth;
	}
	
	@Override
	protected void renderContent(GuiRenderHelper helper, Style style, int width, int height) {
		font.drawStringWithShadow(this.title, width - font.getStringWidth(this.title) - 10, 0, ColorUtils.WHITE);
		helper.drawRect(-3, 10, width + 3, 11, ColorUtils.BLACK);
		
		int left = this.posX + 1;
		int top = this.posY + 1;
		int right = this.posX + this.width + 5;
		int bottom = this.posY + this.height + 5;
		int guiWidth = this.getParent().width;
		int guiHeight = this.getParent().height;
		if (this.getParent() instanceof GuiDragablePanel) {
			GuiDragablePanel gui = (GuiDragablePanel) this.getParent();
			guiWidth = gui.maxWidth;
			guiHeight = gui.maxHeight;
		}
		if (left < 0)
			this.posX = -2;
		if (right > guiWidth)
			this.posX = guiWidth - this.width - 4;
		if (top < 0)
			this.posY = -2;
		if (bottom > guiHeight)
			this.posY = guiHeight - this.height - 4;
	}
	
	@Override
	public boolean canOverlap() {
		return false;
	}
	
	@Override
	public boolean mousePressed(int x, int y, int button) {
		boolean results = super.mousePressed(x, y, button);
		if (this.isMouseOver()) {
			selected = true;
			if (this.getParent() instanceof GuiDragablePanel) {
				GuiDragablePanel gui = (GuiDragablePanel) this.getParent();
				gui.selected = true;
			}
		}
		return results;
	}
	
	@Override
	public void mouseReleased(int x, int y, int button) {
		super.mouseReleased(x, y, button);
		selected = false;
		if (this.getParent() instanceof GuiDragablePanel) {
			GuiDragablePanel gui = (GuiDragablePanel) this.getParent();
			gui.selected = false;
		}
	}
	
	@Override
	public void mouseDragged(int x, int y, int button, long time) {
		super.mouseDragged(x, y, button, time);
		if (selected) {
			
			this.posX = x - (this.width / 2);
			this.posY = y - (this.height / 2);
			
			int left = this.posX + 1;
			int top = this.posY + 1;
			int right = this.posX + this.width + 5;
			int bottom = this.posY + this.height + 5;
			int guiWidth = this.getParent().width;
			int guiHeight = this.getParent().height;
			if (this.getParent() instanceof GuiDragablePanel) {
				GuiDragablePanel gui = (GuiDragablePanel) this.getParent();
				guiWidth = gui.maxWidth;
				guiHeight = gui.maxHeight;
			}
			if (left < 0)
				this.posX = -2;
			if (right > guiWidth)
				this.posX = guiWidth - this.width - 4;
			if (top < 0)
				this.posY = -2;
			if (bottom > guiHeight)
				this.posY = guiHeight - this.height - 4;
		}
	}
	
}
