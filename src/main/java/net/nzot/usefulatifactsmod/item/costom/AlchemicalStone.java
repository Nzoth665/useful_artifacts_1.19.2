package net.nzot.usefulatifactsmod.item.costom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class AlchemicalStone extends Item implements ICurioItem {
    public AlchemicalStone(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer) {
        return true;
    }
}
