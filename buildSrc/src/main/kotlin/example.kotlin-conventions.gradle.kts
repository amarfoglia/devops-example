////import io.gitlab.arturbosch.detekt.Detekt
////import io.gitlab.arturbosch.detekt.DetektCreateBaselineTask
//import org.gradle.accessors.dm.LibrariesForLibs
//
//val libs = the<LibrariesForLibs>()
//println("from pre compiled script plugin: ${libs.versions.kotlin.get()}")
//
//plugins {
////    alias(libs.plugins.detekt)
//    id("org.jetbrains.kotlin.jvm")
//}
//
//dependencies {
//    implementation(libs.plugins.kotlin)
//}
//
//// DETEKT configuration
////detekt {
////    autoCorrect = true
////}
//
////tasks.withType<Detekt>().configureEach {
////    jvmTarget = "11"
////}
////tasks.withType<DetektCreateBaselineTask>().configureEach {
////    jvmTarget = "11"
////}
//
//// JAVA configuration
//java {
//    sourceCompatibility = JavaVersion.VERSION_11
//    targetCompatibility = JavaVersion.VERSION_11
//}
//
//// KOTLIN configuration
//tasks.withType<KotlinCompile> {
//    kotlinOptions {
//        jvmTarget = "11"
//    }
//}
