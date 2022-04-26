plugins {
    application
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.detekt)
}

detekt {
    autoCorrect = true
}

application {
    mainClass.set("it.unibo.example.MainKt")
}

dependencies {
  implementation(project(":utils"))
}