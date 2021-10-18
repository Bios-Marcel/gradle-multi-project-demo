# Multi Project Gradle Demo

Ziel dieser Demo ist es eine APM ähnliche Struktur mit Gradle als Buildsystem bereitzustellen.

## Unterschiede zum APM Projekt

* Sourcecode Struktur
  * Der sonst in jedem Projekt vorhandene `src/demo`-Ordner ist nun ein eigenes Projekt, welches u.a. seine eigenen Dependencies hat, jedoch nach wie vor Zugriff auf alle Klassen haben kann.
* Build Struktur
  * Build-File und Dependencies sind nun ein Format bzw. Tool, sprich Gradle statt Maven + Ant.
  * Das Build-File und Dependencies sind nun auf Ebenen abstrahiert. Vorerst common, library, application und die jeweils spezifischen build.gradle.kts Files der einzelnen Module
  * Das Build-File ist nicht mehr deklarativ, sondern ein Programm in dem theoretisch beliege Logik ausgeführt weden kann.
* Entwicklungsumgebung
  * Keine Dependency auf Eclipse. Alles soll theoretisch ohne IDE verwendbar sein
    * PMD in Gradle integriert
    * Formatter (Google-Java-Formatter)
    * Ausführung via `.\gradlew server:run` und `.\gradlew client:run`. Siehe demo Build-File für weitere Erklärung.
* Dependencies
  * Es wird Java 17 verwendet
  * Es wird JUnit 5 verwendet

## Build-Dependencies

Zum Ausführen und Bauen des Projektes wird NICHTS benötigt. Es muss lediglich das bereits vorhandene `gradlew(.bat)`-File ausgeführt werden. Falls nicht vorhanden wird automatisch eine vorab spezifizierte JDK aus dem Internet heruntergeladen und im Benutzerordner vorgehalten.

## Tests und Linting

Tests und Linter auf allen Projekten kann im Root-Ordner wie folgt ausgeführt werden:

```ps
.\gradlew check
```

## Formatting

Formatierung kann mit dem Google-Java-Formatter angestoßen werden:

```
.\gradlew goJF
```

## Server ausführen

Ausführung via:

```ps
.\gradlew server:run
```

## Client ausführen

Ausführung via:

```ps
.\gradlew client:run
```

## Demo ausführen

Ausführung via:

```ps
.\gradlew demo:run -Pmainclass="com.isp.kkg.demo.MAINFILE"
```
