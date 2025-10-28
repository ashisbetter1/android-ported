package me.alpha432.oyvey.features.modules.render;

import me.alpha432.oyvey.features.modules.Module;

public class TestModule extends Module {

    public TestModule() {
        super("TestModule", "A blank module for testing builds", Category.RENDER, true, false, false);
    }

    @Override
    public void onEnable() {
        // This runs when the module is enabled
        System.out.println("TestModule enabled!");
    }

    @Override
    public void onDisable() {
        // This runs when the module is disabled
        System.out.println("TestModule disabled!");
    }
}
