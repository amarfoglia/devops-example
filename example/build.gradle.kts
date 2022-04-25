plugins {
    application
    alias(libs.plugins.kotlin.jvm)
}

application {
    mainClass.set("it.unibo.example.MainKt")
}

dependencies {
  implementation(project(":utils"))
}