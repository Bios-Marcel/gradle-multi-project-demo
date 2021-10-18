plugins {
    // Alle Libraries erben von den common-conventions.
    id("com.isp.kkg.java-common-conventions")

    // Dies erlaubt dem Projekt Dependencies als "api" oder "implementation" zu deklarieren.
    // Hat z.B. das Projekt "shared" die Library "guava" als "api" deklariert, so können Projekte,
    // die "shared" konsumieren, ebenfalls "guava" verwenden. Die Deklrarierung als "implementation"
    // bedeutet das andere Projekte keinen Zugriff auf "guava" haben, da dies dann ein
    // Implementation-Detail ist.
    // Siehe: https://docs.gradle.org/current/userguide/java_library_plugin.html
    `java-library`
}
