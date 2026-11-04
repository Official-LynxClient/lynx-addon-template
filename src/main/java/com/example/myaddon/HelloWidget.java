package com.example.myaddon;

import net.lynxclient.api.hud.HudWidgetConfig;
import net.lynxclient.api.hud.TextHudWidget;

/** A HUD text "Hello  world" – movable in the HUD editor, with LynxClient's style settings. */
public final class HelloWidget extends TextHudWidget {
    public HelloWidget() {
        // Module id: [a-z0-9_], unique across all addons – prefix it with your addon name
        super("my_addon_hello", true, HudWidgetConfig.Anchor.TOP, 0, 4);
    }

    @Override
    protected String label() {
        return "Hello";
    }

    @Override
    protected String value(boolean editor) {
        return "world";
    }
}
