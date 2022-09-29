package net.nzot.usefulatifactsmod.item.costom;

import net.minecraft.commands.arguments.ResourceKeyArgument;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.enchantment.DamageEnchantment;
import net.minecraftforge.registries.DeferredRegister;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class BloodTies extends Item implements ICurioItem {
    public BloodTies(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        LivingEntity livingEntity = slotContext.entity();
        if (livingEntity.getArmorValue()<=5){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST,20,0));
            livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20,2));
            livingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED,20,1));

        }
        livingEntity.addEffect(new MobEffectInstance(MobEffects.HUNGER,20,0));
        ICurioItem.super.curioTick(slotContext, stack);
    }

    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        LivingEntity livingEntity = slotContext.entity();

        if(livingEntity.getActiveEffects()==MobEffects.DAMAGE_BOOST && !(livingEntity.getArmorValue()<=5)) {
            livingEntity.setHealth(livingEntity.getHealth() - livingEntity.getMaxHealth() / 2);
        }else{
            livingEntity.setHealth(livingEntity.getHealth() - livingEntity.getMaxHealth());
        }

        /**/
        livingEntity.hurt(new DamageSource("custom").bypassArmor().setExplosion(), 1);
        /**/

        ICurioItem.super.onUnequip(slotContext, newStack, stack);
    }

    @Override
    public InteractionResult onItemUseFirst(ItemStack stack, UseOnContext context) {

        return super.onItemUseFirst(stack, context);
    }
}
