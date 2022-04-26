plugins {
//  id("example.kotlin-conventions")
    alias(libs.plugins.detekt)
    alias(libs.plugins.kotlin.jvm)
}

detekt {
    autoCorrect = true
}

// JAVA configuration
//java {
//  sourceCompatibility = JavaVersion.VERSION_11
//  targetCompatibility = JavaVersion.VERSION_11
//}