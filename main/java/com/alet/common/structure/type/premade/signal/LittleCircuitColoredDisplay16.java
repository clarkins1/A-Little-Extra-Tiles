package com.alet.common.structure.type.premade.signal;

import javax.annotation.Nullable;

import com.creativemd.littletiles.client.gui.handler.LittleStructureGuiHandler;
import com.creativemd.littletiles.common.action.LittleActionException;
import com.creativemd.littletiles.common.action.block.LittleActionActivated;
import com.creativemd.littletiles.common.structure.registry.LittleStructureType;
import com.creativemd.littletiles.common.structure.type.premade.LittleStructurePremade;
import com.creativemd.littletiles.common.tile.LittleTile;
import com.creativemd.littletiles.common.tile.parent.IStructureTileList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LittleCircuitColoredDisplay16 extends LittleStructurePremade {
	
	public String charDisplayed = "";
	
	public LittleCircuitColoredDisplay16(LittleStructureType type, IStructureTileList mainBlock) {
		super(type, mainBlock);
	}
	
	@Override
	public void tick() {
		if (!isClient()) {
			
		}
	}
	
	@Override
	protected void loadFromNBTExtra(NBTTagCompound nbt) {
	}
	
	@Override
	protected void writeToNBTExtra(NBTTagCompound nbt) {
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, LittleTile tile, BlockPos pos, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ, LittleActionActivated action) throws LittleActionException {
		if (!worldIn.isRemote)
			LittleStructureGuiHandler.openGui("programmer", new NBTTagCompound(), playerIn, this);
		return true;
	}
	
}
