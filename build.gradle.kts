// LynxClient addon template. Build: ./gradlew build → build/libs/my-addon-<version>.jar
// Try it: launcher Settings → Developer → "Load unsigned addons", then copy the jar into Addons → "Open folder". Docs: https://docs.lynxclient.de
plugins { java }

version = "1.0.0"

repositories {
    maven("https://download.lynxclient.de/maven")
}

dependencies {
    // compileOnly: LynxClient brings the API at runtime, never bundle it into your jar
    compileOnly("net.lynxclient:lynx-api:${property("lynx_api")}")
}

// LynxClient runs on Java 17 (1.8.9) up to 25 (26.x), so build for the lowest
tasks.withType<JavaCompile>().configureEach {
    options.release = 17
    options.encoding = "UTF-8"
}

tasks.processResources {
    inputs.property("version", project.version)
    filesMatching("fabric.mod.json") { expand("version" to project.version) }
}
