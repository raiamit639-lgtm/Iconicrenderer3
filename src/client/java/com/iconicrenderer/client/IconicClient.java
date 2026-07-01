package com.iconicrenderer.client;

import com.iconicrenderer.client.gui.VideoSettingsScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class IconicClient implements ClientModInitializer {

    private static KeyBinding openGui;

    @Override
    public void onInitializeClient() {

        openGui = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.iconicrenderer.open_gui",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_RIGHT_SHIFT,
                "category.iconicrenderer"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openGui.wasPressed()) {
                client.setScreen(new VideoSettingsScreen());
            }
        });

        System.out.println("[IconicRenderer] Client Loaded");
    }
}