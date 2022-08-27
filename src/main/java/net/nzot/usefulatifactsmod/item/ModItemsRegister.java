package net.nzot.usefulatifactsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nzot.usefulatifactsmod.UsefulAtifactsMod;

public class ModItemsRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UsefulAtifactsMod.MODID);

    public static final RegistryObject<Item> STONE = ITEMS.register("stone",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> REDSTONE_STON = ITEMS.register("redstone_ston",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> REDSTONE_STON2 = ITEMS.register("redstone_ston2",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> REDSTONE_STON3 = ITEMS.register("redstone_ston3",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> REDSTONE_STON4 = ITEMS.register("redstone_ston4",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> REDSTONE_STON5 = ITEMS.register("redstone_ston5",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> REDSTONE_STON6 = ITEMS.register("redstone_ston6",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> REDSTONE_STON7 = ITEMS.register("redstone_ston7",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> REDSTONE_STON8 = ITEMS.register("redstone_ston8",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> ALCHEMICAL_STONE = ITEMS.register("alchemical_stone",
            () -> new /*p*/Item/*p*/(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> HELL_STAR = ITEMS.register("hell_star",
            () -> new /*p*/Item/*p*/(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
