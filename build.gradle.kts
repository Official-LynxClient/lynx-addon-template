// LynxClient addon. The plugin sets up Java 17, the Lynx API and the store checks.
//   ./gradlew build             build/libs/my-addon-<version>.jar (fails if the store would reject it)
//   ./gradlew installLynxAddon  copy it into LynxClient's addon folder
//   ./gradlew runLynx           install and let the launcher start the game
// Docs: https://docs.lynxclient.de
plugins { id("net.lynxclient.addon") version "0.1.18" }

version = "1.0.0"
