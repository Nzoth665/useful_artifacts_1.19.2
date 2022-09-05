package net.nzot.usefulatifactsmod.item.costom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class OceanEye extends Item  implements ICurioItem {
    public OceanEye(Properties p_41383_) {
        super(p_41383_);
    }
    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        LivingEntity livingEntity = slotContext.entity();
        if (livingEntity.isInWaterRainOrBubble()){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER,20,1));
        }else {
            livingEntity.setAirSupply(-100);
        }
        ICurioItem.super.curioTick(slotContext, stack);
    }
}
