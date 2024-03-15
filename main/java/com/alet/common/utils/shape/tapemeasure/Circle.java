package com.alet.common.utils.shape.tapemeasure;

import java.util.List;

import javax.vecmath.Point3d;

import com.alet.client.gui.overlay.controls.GuiOverlayTextList;
import com.creativemd.creativecore.common.gui.GuiControl;
import com.creativemd.littletiles.common.item.ItemMultiTiles;
import com.creativemd.littletiles.common.util.grid.LittleGridContext;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.Vec3d;

public class Circle extends MeasurementShape {
    
    public Circle(int pointsNeeded, String shapeName) {
        super(pointsNeeded, shapeName);
        // TODO Auto-generated constructor stub
    }
    
    public static void drawCircle(Vec3d pos, Vec3d pos2, float red, float green, float blue, float alpha) {
        EntityPlayer player = Minecraft.getMinecraft().player;
        LittleGridContext context = LittleGridContext.get(ItemMultiTiles.currentContext.size);
        //radius = context.toVanillaGrid(radius);
        
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();
        
        //int pointsToDraw = (int) Math.max(50, radius*20);
        
        /*
        double anglePerPoint = (Math.PI/pointsToDraw)*2;
        for(int i = 0; i < pointsToDraw; i++) {
        	double angle = anglePerPoint * i;
        	double x = Math.sin(angle)*radius;
        	double y = Math.cos(angle)*radius;
        	bufferbuilder.pos((x + pos.x) - d0 -0.001, (y + pos.y) - d1, pos.z - d2).color(red, green, blue, alpha).endVertex();
        }*/
    }
    
    @Override
    protected void getText(GuiOverlayTextList textList, List<String> measurementUnits, int colorInt) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    protected void drawShape(List<Point3d> points, LittleGridContext context, float red, float green, float blue, float alpha) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    protected List<String> getMeasurementUnits(List<Point3d> points, LittleGridContext context) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<GuiControl> getCustomSettings(NBTTagCompound nbt, LittleGridContext context) {
        // TODO Auto-generated method stub
        return null;
    }
    
}

/*
double y = 0.0;
double x = -radius;
double newX = x;

while(!Double.isNaN(y)) {
	x = cleanDouble(x);
	newX = x;
	newX = newX/10;
	newX = cleanDouble(newX);
	y = (Math.sqrt(Math.pow(radius,2)-Math.pow(x, 2)))/10;
	//System.out.println(x + " / " + newX + " " + y);
	bufferbuilder.pos((newX + minX) - d0 -0.001, (y + minY) - d1, minZ - d2).color(red, green, blue, alpha).endVertex();
	x = x + 0.125;
}

y = 0.0;
x = radius;

while(!Double.isNaN(y)) {
	x = cleanDouble(x);
	newX = x;
	newX = newX/10;
	newX = cleanDouble(newX);
	y = -(Math.sqrt(Math.pow(radius,2)-Math.pow(x, 2)))/10;
	//System.out.println(x + " / " + newX + " " + y);
	bufferbuilder.pos((newX + minX) - d0 - 0.001, (y + minY) - d1 - 0.001, minZ - d2 - 0.001).color(red, green, blue, alpha).endVertex();
	x = x - 0.125;
}
*/