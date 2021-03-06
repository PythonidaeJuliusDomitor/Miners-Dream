package com.lavaingot.minersdream.objects.effects;

import com.lavaingot.minersdream.init.PotionInit;
import com.lavaingot.minersdream.objects.damagesources.CustomDamageSource;
import com.lavaingot.minersdream.util.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class PotionEffects extends Potion{ 
	
	public static final ResourceLocation icon = new ResourceLocation(Reference.MOD_ID, "/textures/gui/inventory.png".substring(1));
	
	public PotionEffects(boolean isBadEffect, int liquidColorIn, String name) { this(isBadEffect, liquidColorIn, name, 1D); }
	
	public PotionEffects(boolean isBadEffect, int liquidColorIn, String name, Double effectivenessIn) {
		super(isBadEffect, liquidColorIn);
		setIconIndex(0, 0);
		setRegistryName(name);
		setPotionName(name);
		setEffectiveness(effectivenessIn);
		
		PotionInit.POTIONS.add(this);
	}
	
	@Override
	protected Potion setIconIndex(int x, int y) {
		
		return super.setIconIndex(x, y);
	}
	
	public int getStatusIconIndex(){ 
		ITextureObject texture = Minecraft.getMinecraft().renderEngine.getTexture(icon);
		Minecraft.getMinecraft().renderEngine.bindTexture(icon); 
		return super.getStatusIconIndex(); 
		}
	
	@Override
	protected Potion setEffectiveness(double effectivenessIn) {
		
		return super.setEffectiveness(effectivenessIn);
	}
	
	@Override
	public void performEffect(EntityLivingBase entityLivingBaseIn, int amplifier) {
		
		if (amplifier > 0) {
			if (entityLivingBaseIn.world.rand.nextInt(1000)== 0) {
				entityLivingBaseIn.hurtTime = 10;
				entityLivingBaseIn.attackEntityFrom(CustomDamageSource.RADIATION, 1.0F * amplifier);
			}
		} else if (amplifier == 0) {
			if (entityLivingBaseIn.world.rand.nextInt(1000) == 0) {
				entityLivingBaseIn.hurtTime = 10;
				entityLivingBaseIn.attackEntityFrom(CustomDamageSource.RADIATION, 1.0F);
			}
		}
	}
}
