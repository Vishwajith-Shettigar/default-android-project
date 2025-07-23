plugins {
  id("com.android.library")
//  kotlin("kapt")
  id("com.google.devtools.ksp")

  id("org.jetbrains.kotlin.android")
}

android {
  namespace = "com.example.data"
  compileSdk = 34
  defaultConfig {
    minSdk = 21
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
  }
  kotlinOptions {
    jvmTarget = "11"
  }
}

dependencies {
  // Room components
  implementation (libs.androidx.room.runtime)

// Kotlin extensions + Coroutines support for Room
  implementation (libs.androidx.room.ktx)

// Annotation processor (for Java or without KSP)
  ksp ("androidx.room:room-compiler:2.6.0")

// (Optional) Use KSP instead of kapt for faster builds
// apply plugin: 'com.google.devtools.ksp'
// ksp "androidx.room:room-compiler:2.6.1"
}