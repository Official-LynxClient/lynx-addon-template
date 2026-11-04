package com.example.myaddon;

import net.lynxclient.api.LynxApi;
import net.lynxclient.api.addon.LynxAddon;

/** Entry point, named in fabric.mod.json under "entrypoints" → "lynx". */
public final class MyAddon implements LynxAddon {
    @Override
    public void onLoad(LynxApi lynx) {
        lynx.modules().register(new HelloWidget());
    }
}
