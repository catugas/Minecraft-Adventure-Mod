package com.catugas.testmod.objects.items.explosiveArrow;

import com.catugas.testmod.init.ModItems;

import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class EntityExplosiveArrow extends EntityArrow
{
	// public static EXPLODE = false;
			
    private Object newExplosion;

	public EntityExplosiveArrow(World worldIn)
    {
        super(worldIn);
    }

    public EntityExplosiveArrow(World worldIn, EntityLivingBase shooter)
    {
        super(worldIn, shooter);
    }

    public EntityExplosiveArrow(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate()
    {
        super.onUpdate();

//        if (this.world.isRemote && !this.inGround)
//        {
//        	// this.
//            this.world.spawnParticle(EnumParticleTypes.SPELL_INSTANT, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
//        }   //----- ^Residual Particle code from Spectral Class ----- 
    }

    protected ItemStack getArrowStack()
    {
        return new ItemStack(ModItems.EXPLO_ARROW);
    }

    // ----------------------------- Explosion Code --------------------------
    // To do - Render while flying
    
    protected void onHit(RayTraceResult raytraceResultIn)
    {
    	super.onHit(raytraceResultIn);
    	Entity entity = raytraceResultIn.entityHit;
    	BlockPos blockpos = raytraceResultIn.getBlockPos();
    	this.world.createExplosion((EntityArrow)null, this.posX, this.posY, this.posZ, 2.5F, true);
    	this.setDead();
    	
    }
    
    // -----------------------------------------------------------------------
    
    public static void registerFixesSpectralArrow(DataFixer fixer)
    {
        EntityArrow.registerFixesArrow(fixer, "ExplosiveArrow");
    }
}
