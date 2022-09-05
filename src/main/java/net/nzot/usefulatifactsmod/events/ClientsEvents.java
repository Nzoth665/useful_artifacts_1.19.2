package net.nzot.usefulatifactsmod.events;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nzot.usefulatifactsmod.UsefulAtifactsMod;
import net.nzot.usefulatifactsmod.util.KeyBinding;

public class ClientsEvents {
    public static boolean AKTIVITY1_key = false;
    @Mod.EventBusSubscriber(modid = UsefulAtifactsMod.MODID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(KeyBinding.AKTIVITY1_KEY.consumeClick()) {
                if(AKTIVITY1_key){
                    AKTIVITY1_key = true;
                }else {
                    AKTIVITY1_key = false;
                }
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Pressed a Key!"));
            }
        }
    }
    @Mod.EventBusSubscriber(modid = UsefulAtifactsMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBinding.AKTIVITY1_KEY);
        }
    }
}
