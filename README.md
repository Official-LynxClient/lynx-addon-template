# LynxClient addon template

A ready-to-build addon for [LynxClient](https://lynxclient.de): one HUD widget ("Hello  world"), German and English texts. The same jar runs on Minecraft 1.8.9, 1.21.1 and 26.x.

**Documentation: [docs.lynxclient.de](https://docs.lynxclient.de)**

## Use it

1. Click **Use this template** (or download the zip).
2. Change `id`, `name` and the entry point in `src/main/resources/fabric.mod.json`, rename the package `com.example.myaddon` and the module id in `HelloWidget`.
3. Build with Java 17 or newer:

   ```bash
   ./gradlew build
   ```

   The jar is in `build/libs/`.
4. Try it: in the LynxClient launcher turn on **Settings → Developer → Load unsigned addons**, copy the jar into **Addons → Open folder** and start any profile.
5. Publish it in the store: [docs.lynxclient.de/store/publishing](https://docs.lynxclient.de/store/publishing).

## Licence

The template is free to use for your own addons, with or without changes ([MIT](LICENSE)).
