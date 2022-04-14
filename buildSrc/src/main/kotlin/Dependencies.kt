import org.gradle.api.JavaVersion

object Plugins {
    const val application = "com.android.application"
    const val kotlin = "kotlin-android"
    const val kapt = "kotlin-kapt"
}

object Configs {
    const val compileSdk = 31
    const val applicationId = "aidapavel.testtask"
    const val minSdk = 23
    const val targetSdk = 31
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object Options {
    val javaVersion = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"
}

object Releases {
    const val versionCode = 1
    const val versionName = "1.0"
}

object Dependencies {

    // Main
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
    const val material = "com.google.android.material:material:${Versions.materialVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val junit = "junit:junit:${Versions.junitVersion}"
    const val testExtJunit = "androidx.test.ext:junit:${Versions.testExtJunitVersion}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCoreVersion}"


}

object Versions {

    // Main
    const val coreKtxVersion = "1.7.0"
    const val appcompatVersion = "1.4.1"
    const val materialVersion = "1.5.0"
    const val constraintLayoutVersion = "2.1.3"
    const val junitVersion = "4.+"
    const val testExtJunitVersion = "1.1.3"
    const val espressoCoreVersion = "3.4.0"


}