package net.nzot.usefulatifactsmod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY1 = "key.usefulatifactsmod.category1";
    public static final String KEY_AKTIVITY1 = "key.usefulatifactsmod.aktiviti1";

    public static final KeyMapping AKTIVITY1_KEY = new KeyMapping(KEY_AKTIVITY1, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM,GLFW.GLFW_KEY_0 /*GLFW.GLFW_KEY_LEFT_ALT*/ , KEY_CATEGORY1);
}
