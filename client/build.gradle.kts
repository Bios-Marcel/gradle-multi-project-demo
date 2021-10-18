plugins {
    id("com.isp.kkg.java-application-conventions")
}

dependencies {
    implementation(project(":shared"))
}

application {
    mainClass.set("com.isp.kkg.client.Client")
}
