package net.nzot.usefulatifactsmod.item.costom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentContents;
import net.minecraft.network.chat.Style;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.List;

public class SoulStone extends Item implements ICurioItem {
    public SoulStone(Properties p_41383_) {
        super(p_41383_);
    }
    public static int sous = 0;

    @Override
    public void appendHoverText(ItemStack p_41421_, @Nullable Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
        p_41423_.add(Component.literal("info.items.soul_stone1"+sous+"info.items.soul_stone2").withStyle(ChatFormatting.BLUE));
        super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);
    }
}
