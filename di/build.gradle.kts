plugins {
  id("com.android.library")  // Added to make this an Android library module
  id("org.jetbrains.kotlin.android")  // For Kotlin Android support
  id("com.google.devtools.ksp")  // For annotation processing (Room-like setup)
  id("com.google.dagger.hilt.android")  // Hilt plugin for DI
}


android {
  namespace = "com.example.di"
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
  ksp(libs.hilt.android.compiler)
  implementation(libs.hilt.android)
}