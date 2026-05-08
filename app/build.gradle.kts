
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.google.gms) // This is critical!
    id("kotlin-kapt")
   }

android {
    namespace = "com.critetiontech.ctvitalio"
    compileSdk = 35

    sourceSets["main"].resources.srcDir("libs")


    defaultConfig {
        applicationId = "com.critetiontech.ctvitalio"
        minSdk = 24
        targetSdk = 34
        versionCode = 2
        versionName = "2.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

        manifestPlaceholders["appAuthRedirectScheme"] = "com.critetiontech.ctvitalio"


    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources=true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
        freeCompilerArgs = listOf("-XXLanguage:+PropertyParamAnnotationDefaultTargetMode")
    }
    buildFeatures {
        viewBinding = true
        //noinspection DataBindingWithoutKapt
        dataBinding = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}



dependencies {
    implementation(platform(libs.firebase.bom))
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(fileTree(mapOf(
        "dir" to "libs",
        "include" to listOf("*.aar", "*.jar")
    )))
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.firebase.firestore.ktx)
    implementation(libs.androidx.work.runtime.ktx)
    implementation(libs.androidx.core.animation)
    implementation(libs.core)
    implementation(libs.androidx.tools.core)


    /*    implementation(libs.androidx.navigation.fragment.ktx)
        implementation(libs.androidx.navigation.ui.ktx)*/
    testImplementation(libs.junit)
    implementation(libs.glide)
    // OkHttp core + Okio (for ByteString.toByteString)
    implementation(libs.okhttp)
    implementation(libs.okio)
    implementation(libs.androidx.camera.camera2)
    implementation(libs.androidx.camera.lifecycle)
    implementation(libs.androidx.camera.view)
// ML Kit QR Scanner
    implementation("com.google.mlkit:barcode-scanning:17.2.0")
    // ✅ This fixes the ListenableFuture error
    implementation(libs.guava)
    implementation(libs.shimmer)

    implementation(libs.logging.interceptor) // or latest version
    implementation (libs.androidx.core)
    //Dimen
    implementation (libs.ssp.android)
    implementation (libs.sdp.android)
    implementation(libs.firebase.messaging)
    implementation(libs.firebase.installations)
    implementation(libs.android.image.cropper)
//    implementation("com.github.barteksc.pdfviewer:android-pdf-viewer:3.1.0") // Stable version of PDFView
    implementation (libs.material.v140)
    implementation(libs.android.gif.drawable.v1223)
    //otp view
//    implementation (libs.otpview)
    implementation (libs.gson)
    implementation (libs.android.gif.drawable)
    implementation (libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.zxing.android.embedded)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    // retrofit
    implementation(libs.retrofit)
    implementation(libs.lottie.v601)
    implementation(libs.mpandroidchart)
    implementation(libs.converter.gson)
    implementation (libs.lottie)
    implementation(libs.circleimageview)
    implementation(libs.play.services.location)
    implementation(libs.androidx.cardview)
    implementation (libs.androidx.navigation.fragment.ktx)
    implementation (libs.androidx.navigation.ui.ktx)
    implementation (libs.flexbox)
    implementation(libs.androidx.constraintlayout.v214)
    implementation (libs.dotsindicator)
    implementation(libs.appauth)
    implementation (libs.androidx.room.runtime)
    implementation (libs.androidx.room.ktx)
    kapt(libs.androidx.room.compiler)
    implementation(libs.androidx.swiperefreshlayout)
    

}
