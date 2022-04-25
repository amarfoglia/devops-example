plugins {
    alias(libs.plugins.gitSemVer)
    alias(libs.plugins.taskTree)
}

allprojects {
    version = 0.1
    group = "it.unibo.example"

    repositories {
        mavenCentral()
    }
}
