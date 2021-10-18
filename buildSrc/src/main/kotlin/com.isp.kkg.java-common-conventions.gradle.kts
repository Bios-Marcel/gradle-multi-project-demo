plugins {
    // Siehe https://docs.gradle.org/current/userguide/java_plugin.html
    java
    // Testet den Source-Code gegen PMD. Dies hilt für Tests und Main.
    pmd
    id("com.github.sherter.google-java-format")
}

repositories {
    // Nutzt das Maven-Central Artifactory zum Beziehen von Dependencies.
    mavenCentral()
}

java {
    toolchain {
        // Nutzt vorhandene JDK17 oder Downloaded automatisch eine
        // Zum deaktivieren von Autodetect, siehe: https://docs.gradle.org/current/userguide/toolchains.html#sub:disable_auto_detect
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.+")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.+")
}
