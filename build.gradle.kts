plugins {
    alias(libs.plugins.gitSemVer)
}

allprojects {
    version = 0.1
    group = "it.unibo.example"

    repositories {
        mavenCentral()
    }
}
