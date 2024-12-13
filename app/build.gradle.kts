plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    //TODO 3 Menambahkan id 'kotlin-kapt' di dalam plugins
    kotlin("kapt") version "1.5.31"
}

android {
    namespace = "com.nandaadisaputra.noteapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.nandaadisaputra.noteapp"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    //TODO 2 Menambah dan Mengaktifkan library DataBinding
    // agar dapat digunakan
    buildFeatures {
        dataBinding = true // Mengaktifkan DataBinding
        viewBinding = true // Mengaktifkan ViewBinding
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    // TODO 1 Menambahkan library di bawah ini
    // Room
    implementation(libs.androidx.room.runtime)
    kapt(libs.androidx.room.compiler)
    // CoordinatorLayout
    implementation(libs.androidx.coordinatorlayout)
    // ssp
    implementation(libs.intuit.ssp.android)
    // sdp
    implementation(libs.intuit.sdp.android) // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    // LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}