plugins {
    id("com.isp.kkg.java-application-conventions")
}

dependencies {
    implementation(project(":client"))
    implementation(project(":server"))
    // Das Demo-Projekt hat Zugriff auf die komplette Public-API des Projektes.
    // Da jedoch client und server ihre dependencies nicht exposen, müssen diese
    // falls gewünscht explizit angegeben werden.
    implementation(project(":shared"))
}

application {
    // Main-Klasse kann via Konsole wie folgt ausgewählt werden:
    //     ./gradlew demo:run -Pmainclass="CLASS"
    // Zum Beispiel:
    //     ./gradlew demo:run -Pmainclass="com.isp.kkg.demo.DemoA"
    mainClass.set(project.findProperty("mainclass").toString())
}
