plugins {
    // Alle Applikationen, z.B: Client oder Server, erben von den common-conventions.
    id("com.isp.kkg.java-common-conventions")

    // Dieses Plugin macht ein Modul ausführbar.
    // Siehe: https://docs.gradle.org/current/userguide/application_plugin.html
    application

    // Dieses Plugin macht das Modul zu einer ausführbaren Jar.
    id("com.github.johnrengelman.shadow")

    // Plugin zum Bauen einer Native Executable.
    id("org.panteleyev.jpackageplugin")
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = application.mainClass.get()
    }
}