plugins {
    // Support convention plugins written in Kotlin. Convention plugins are build
    // scripts in 'src/main' that automatically become available as plugins in the main build.
    `kotlin-dsl`
}

repositories {
    // Erlaubt Community-Plugins aus dem Internet zu laden.
    gradlePluginPortal()
}

dependencies {
    // Plugins funktionieren hier leicht anders als in Modul-Buildscripts.
    // Siehe: https://docs.gradle.org/current/userguide/custom_plugins.html#applying_external_plugins_in_precompiled_script_plugins

    // Erlaubt den Convetions das Google-java-Format Plugin zu verwenden.
    implementation("gradle.plugin.com.github.sherter.google-java-format:google-java-format-gradle-plugin:0.9")
    // Zum Bauen von Nativen Executables.
    implementation("org.panteleyev:jpackage-gradle-plugin:1.3.1")
    // Fat Jar Bauen
    implementation("gradle.plugin.com.github.johnrengelman:shadow:7.1.0")
}
