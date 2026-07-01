package com.iconicrenderer.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;

public class VideoSettingsScreen extends Screen {

    public VideoSettingsScreen() {
        super(Text.literal("Video Settings"));
    }

    @Override
    protected void init() {
        // buttons later
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);

        context.drawCenteredTextWithShadow(
                this.textRenderer,
                "Iconic Renderer Settings",
                this.width / 2,
                20,
                0xFFFFFF
        );

        super.render(context, mouseX, mouseY, delta);
    }
}