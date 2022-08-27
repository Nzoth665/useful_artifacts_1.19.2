package net.nzot.usefulatifactsmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.nzot.usefulatifactsmod.UsefulAtifactsMod;

public class ModItemsRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UsefulAtifactsMod.MODID);
    //:-)
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
