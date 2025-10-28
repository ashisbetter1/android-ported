package me.alpha432.oyvey.features.modules.render;

import me.alpha432.oyvey.features.modules.Module;
import me.alpha432.oyvey.features.settings.Setting;
import net.minecraft.client.option.GameOptions;

/**
 * Fullbright module for OyVey client.
 * Increases gamma for maximum brightness.
 */
public class FullBright extends Module {

    private float previousGamma;
    private final Setting<Float> gammaValue = register(new Setting<>("Gamma", 1000.0f, 1.0f, 10000.0f));

    public FullBright() {
        super("FullBright", "Makes everything bright", Category.RENDER, true, false, false);
    }

    @Override
    public void onEnable() {
        if (mc.world == null) return;
        GameOptions options = mc.options;
        previousGamma = options.getGamma().getValue().floatValue();
        options.getGamma().setValue(gammaValue.getValue().doubleValue());
    }

    @Override
    public void onDisable() {
        if (mc.world == null) return;
        mc.options.getGamma().setValue((double) previousGamma);
    }

    @Override
    public void onUpdate() {
        if (mc.world == null) return;
        // keep gamma maxed while enabled (in case other mods change it)
        mc.options.getGamma().setValue(gammaValue.getValue().doubleValue());
    }
}
