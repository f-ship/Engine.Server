plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
    application
}

group = "ship.f.engine"
version = "1.0.0"

application {
    mainClass.set("ship.f.engine.server.ServerKt")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=${extra["io.ktor.development"] ?: "false"}")
}

dependencies {
//    api(":Utils")
//    api(":KSP")
//    api(":Core")

    implementation(libs.logback)
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.server.netty)
    testImplementation(libs.ktor.server.tests.host)
    testImplementation(libs.kotlin.test.junit)
}
