package com.alet.common.utils.shape.tapemeasure;

import java.util.List;

import javax.vecmath.Point3d;

import com.alet.client.gui.overlay.controls.GuiOverlayTextList;
import com.creativemd.creativecore.common.gui.GuiControl;
import com.creativemd.littletiles.common.util.grid.LittleGridContext;

import net.minecraft.nbt.NBTTagCompound;

public class SpacedPattern extends MeasurementShape {
    
    public SpacedPattern(String shapeName) {
        super(2, shapeName);
        // TODO Auto-generated constructor stub
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
