package net.nzot.usefulatifactsmod.events;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.Mod;
import net.nzot.usefulatifactsmod.UsefulAtifactsMod;
import net.nzot.usefulatifactsmod.item.costom.SoulStone;

@Mod.EventBusSubscriber(modid = UsefulAtifactsMod.MODID)
public class ModEventsRegister {
    public static void AlchemicalStone(){
        /**/
    }
    public static void SoulStone(LivingDeathEvent deathEvent, LivingEntity livingEntity){
        Entity entity = deathEvent.getEntity();
        ItemStack itemStack = livingEntity.getItemBySlot(EquipmentSlot.byName("charm"));
        if((entity.getX()-livingEntity.getX()<11) && (entity.getY()-livingEntity.getY()<11) && (entity.getZ()-livingEntity.getZ()<11)){
            /**/
            Minecraft.getInstance().player.sendSystemMessage(Component.literal("Soul = "+SoulStone.sous));
            /**/
        }
    }
}
