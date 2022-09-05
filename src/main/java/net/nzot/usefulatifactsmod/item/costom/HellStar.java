package net.nzot.usefulatifactsmod.item.costom;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class HellStar extends Item implements ICurioItem {
    public HellStar(Properties p_41383_) {
        super(p_41383_);
    }


    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        LivingEntity livingEntity = slotContext.entity();

        if(livingEntity.getActiveEffects() == MobEffects.WITHER){
            livingEntity.removeEffect(MobEffects.WITHER);
        }



        ICurioItem.super.curioTick(slotContext, stack);
    }


    /*
    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        if(livingEntity.getActiveEffects() == MobEffects.WITHER){
            livingEntity.removeEffect(MobEffects.WITHER);
        }
        ICurioItem.super.curioTick(identifier, index, livingEntity, stack);
    }
    */
}
