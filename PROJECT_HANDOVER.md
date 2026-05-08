# Project Handover Document: NativeVitalIO

## 1. Project Overview

**Project Name:** NativeVitalIO  
**Package Name:** `com.critetiontech.ctvitalio`  
**Platform:** Android (Kotlin)  
**Current Version:** 2.0 (Version Code: 2)  
**Firebase Project ID:** smartheartfailureclinic  

### 1.1 Description
NativeVitalIO is a comprehensive health monitoring and wellness management Android application. The app provides features for tracking vital signs, managing medications, fitness activities, diet plans, challenges, and integrates with Omron health devices for connectivity.

---

## 2. Technology Stack

### 2.1 Core Technologies
- **Language:** Kotlin 2.1.0
- **Minimum SDK:** API 24 (Android 7.0)
- **Target SDK:** API 34 (Android 14)
- **Compile SDK:** 35
- **Build Tool:** Gradle 8.11.0 with Kotlin DSL

### 2.2 Architecture Pattern
- **MVVM Architecture** (Model-View-ViewModel)
- **Repository Pattern** for data management
- **Dependency Injection:** Manual (no Hilt/Dagger detected)
- **Navigation:** Jetpack Navigation Component
- **Data Binding & ViewBinding** enabled

### 2.3 Key Libraries & Dependencies

#### Networking
- **Retrofit 2.11.0** - REST API client
- **OkHttp 4.12.0** - HTTP client
- **Okio 3.17.0** - I/O library
- **Logging Interceptor** - Network logging

#### Database
- **Room 2.8.4** - Local database (Runtime + KTX)
- Custom AppDatabase with VitalsDao and VitalsEntity

#### Firebase
- **Firebase BOM 33.1.1**
- Firebase Firestore
- Firebase Messaging (FCM)
- Firebase Installations

#### UI Components
- **Material Design 1.12.0**
- **ConstraintLayout 2.2.1**
- **ViewPager2 with DotsIndicator 5.1.0**
- **Lottie Animations 6.1.0**
- **Shimmer 0.5.0** - Loading skeletons
- **MPAndroidChart v3.1.0** - Charts and graphs
- **Glide 5.0.5** - Image loading
- **ZXing 4.3.0** - QR/Barcode scanning
- **ML Kit Barcode Scanning 17.2.0**

#### Authentication
- **AppAuth 0.11.1** - OAuth 2.0 authentication

#### Utilities
- **Gson 2.10.1** - JSON serialization
- **WorkManager 2.10.3** - Background tasks
- **CameraX 1.3.1** - Camera functionality
- **Android Image Cropper 4.5.0**
- **SSP/SDP Android 1.0.5** - Scalable dimensions
- **Flexbox 3.0.0** - Flexible layouts

### 2.4 Custom Libraries (Local AAR files)
- **omronconnectivitylibrary.aar** (3.0 MB) - Omron device connectivity
- **omronconnectivitylibraryassets.aar** (13.2 MB) - Omron assets

---

## 3. Project Structure

```
nativevitalio/
├── app/
│   ├── src/main/
│   │   ├── java/com/critetiontech/ctvitalio/
│   │   │   ├── UI/                          # Activities & Fragments
│   │   │   │   ├── constructorFiles/        # Base/Utility classes
│   │   │   │   ├── CTChatBot/               # Chatbot implementation
│   │   │   │   ├── fragments/               # Main app fragments (~50+)
│   │   │   │   ├── dashboard_pages/         # Dashboard sub-pages
│   │   │   │   ├── ui/                      # Auth flows (signup, login)
│   │   │   │   └── view/                    # Custom views
│   │   │   ├── adapter/                     # RecyclerView adapters
│   │   │   ├── common/                      # Shared utilities
│   │   │   ├── Database/                    # Room database
│   │   │   │   └── appDatabase/
│   │   │   │       ├── AppDatabase.kt
│   │   │   │       ├── VitalsDao.kt
│   │   │   │       └── VitalsEntity.kt
│   │   │   ├── firebase/                    # Firebase services
│   │   │   ├── logging/                     # Logging management
│   │   │   ├── model/                       # Data models (~50+ models)
│   │   │   ├── networking/                  # API layer
│   │   │   │   ├── ApiService.kt
│   │   │   │   ├── RetrofitInstance.kt
│   │   │   │   ├── AuthInterceptor.kt
│   │   │   │   └── NetworkClient.kt
│   │   │   ├── utils/                       # Utility classes (100+ files)
│   │   │   ├── viewmodel/                   # ViewModels (MVVM)
│   │   │   ├── widgets/                     # Home screen widgets
│   │   │   └── bindingAdapters/             # DataBinding adapters
│   │   ├── res/                             # Resources
│   │   │   ├── layout/                      # XML layouts
│   │   │   ├── navigation/                  # Navigation graphs
│   │   │   ├── values/                      # Strings, colors, themes
│   │   │   ├── drawable/                    # Images, icons
│   │   │   └── xml/                         # Config files
│   │   ├── libs/                            # Local AAR/JAR files
│   │   └── AndroidManifest.xml
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── gradle/
│   ├── libs.versions.toml                   # Version catalog
│   └── wrapper/
├── build.gradle.kts                         # Root build file
├── settings.gradle.kts                      # Project settings
└── README.md
```

---

## 4. Key Features

### 4.1 Authentication & User Management
- Login/Signup with email/password
- OTP verification
- Forgot password flow
- OAuth 2.0 integration (UltraHuman activity)
- Profile management

### 4.2 Health Monitoring
- **Vital Signs Tracking:** Blood pressure, heart rate, etc.
- **BP History:** Track and visualize blood pressure logs
- **Glucose Monitoring:** Trend graphs for glucose levels
- **Sleep Tracking:** Sleep stage bar visualization
- **Weight Management**

### 4.3 Medication Management
- Add/Edit medication reminders
- Dosage chart visualization
- Pill reminder system
- Allergy tracking

### 4.4 Fitness & Wellness
- **Activities:** Walking, biking, gym tracking
- **Challenges:** Active challenges, new challenges creation
- **Diet Plans:** Diet checklist, nutrition tracking
- **Fluid Intake/Output:** Water intake tracking with widget
- **Energy Tank:** Energy level monitoring
- **Mindfulness:** Meditation and breathing exercises

### 4.5 Device Integration
- **Omron Device Connectivity:** Via custom AAR libraries
- Bluetooth LE scanning and connection
- Smart watch connectivity
- Device pairing and data synchronization

### 4.6 Communication
- **Chatbot:** AI-powered health assistant (CTChatBot)
- **Emergency Contacts:** Manage emergency contacts
- Push notifications via FCM

### 4.7 Corporate Module
- Corporate dashboard
- Employee activity tracking
- Admin features for corporate wellness programs

### 4.8 Additional Features
- QR code scanning
- Camera integration for image capture
- PDF viewing capabilities
- Home screen widget (Water Intake)
- Dark/Light theme support
- Multi-language support ready

---

## 5. Configuration & Setup

### 5.1 Build Configuration

#### Project-level (`build.gradle.kts`)
```kotlin
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.google.gms) apply false
}
```

#### App-level (`app/build.gradle.kts`)
- **Namespace:** `com.critetiontech.ctvitalio`
- **Min SDK:** 24
- **Target SDK:** 34
- **Java Compatibility:** Java 11
- **ProGuard:** Enabled for release builds

### 5.2 Repositories
- Google Maven
- Maven Central
- JitPack (`https://jitpack.io`)
- FlatDir (for local AAR files in `libs/`)

### 5.3 Important Plugins
- `kotlin-kapt` - For annotation processing (Room)
- `google-services` - Firebase integration
- ViewBinding & DataBinding enabled

### 5.4 Firebase Configuration
- **Project ID:** smartheartfailureclinic
- **RTDB URL:** https://smartheartfailureclinic-default-rtdb.firebaseio.com
- **Storage Bucket:** smartheartfailureclinic.firebasestorage.app
- Configuration file: `app/google-services.json`

### 5.5 Permissions Required
```xml
<!-- Location -->
ACCESS_FINE_LOCATION, ACCESS_COARSE_LOCATION

<!-- Bluetooth (for device connectivity) -->
BLUETOOTH, BLUETOOTH_SCAN, BLUETOOTH_CONNECT

<!-- Camera -->
CAMERA, RECORD_AUDIO

<!-- Storage -->
READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE, READ_MEDIA_IMAGES

<!-- Network -->
INTERNET, ACCESS_NETWORK_STATE

<!-- Notifications -->
POST_NOTIFICATIONS, VIBRATE, WAKE_LOCK
```

---

## 6. Database Schema

### Room Database
**Database Name:** Defined in AppDatabase.kt

#### Entities
1. **VitalsEntity** - Stores vital sign readings
   - Fields: id, timestamp, vital type, value, unit, etc.

#### DAOs
1. **VitalsDao** - Data access object for vitals
   - Insert, update, delete, query operations

---

## 7. Networking Layer

### API Service Structure
- **Base URL:** Configured dynamically
- **Authentication:** Custom AuthInterceptor with token management
- **Request Types:** GET, POST, PUT, DELETE (dynamic endpoints)

### Key Networking Classes
1. **ApiService.kt** - Interface defining all API endpoints
2. **RetrofitInstance.kt** - Singleton Retrofit instance
3. **AuthInterceptor.kt** - Handles auth tokens in headers
4. **NetworkClient.kt** - HTTP client configuration
5. **NetworkConnectionInterceptor.kt** - Network state checking

### API Endpoints (in ApiEndPoint.kt & ApiEndPointCorporateModule.kt)
- Patient/User APIs
- Vitals APIs
- Medication APIs
- Challenge APIs
- Diet/Nutrition APIs
- Corporate module APIs

---

## 8. State Management

### ViewModel Architecture
- **BaseViewModel.kt** - Base class with common functionality
- **UiEvent.kt** - Sealed class for UI events
- **Result.kt** - Wrapper for API responses (Success/Error/Loading)

### LiveData/StateFlow
- Uses `androidx.lifecycle.livedata.ktx` for reactive UI updates
- ViewModels expose LiveData for UI observation

---

## 9. Build & Release Process

### Debug Build
```bash
./gradlew assembleDebug
```

### Release Build
```bash
./gradlew assembleRelease
```
- ProGuard enabled with resource shrinking
- Uses debug signing config (needs production keystore)

### ProGuard Rules
- Basic rules in `app/proguard-rules.pro`
- Keeps R class resources

---

## 10. Testing

### Test Framework
- **JUnit 4.13.2** - Unit testing
- **AndroidX Test Ext JUnit 1.2.1** - Android instrumentation tests
- **Espresso 3.6.1** - UI testing

### Test Coverage
- Test files located in `src/test/` and `src/androidTest/`
- Limited test coverage observed (requires assessment)

---

## 11. Known Issues & Technical Debt

### 11.1 Potential Issues
1. **Hardcoded URLs:** Check ApiEndPoint files for hardcoded base URLs
2. **Cleartext Traffic:** `usesCleartextTraffic="true"` in manifest (security risk)
3. **Storage Permissions:** Using deprecated storage permissions (needs scoped storage migration)
4. **Manual DI:** No formal dependency injection framework
5. **Large AAR Files:** Omron libraries are large (16+ MB combined)

### 11.2 Code Quality Notes
- 325+ Kotlin files in the project
- Some commented-out dependencies in build.gradle
- Multiple versions of similar libraries (e.g., Lottie, GIF drawable)
- Needs code review for best practices adherence

---

## 12. Environment Setup Instructions

### Prerequisites
1. **Android Studio:** Arctic Fox or newer (recommend latest stable)
2. **JDK:** Version 11 or higher
3. **Android SDK:** API 35 installed
4. **Gradle:** 8.11.0 (wrapper included)

### Setup Steps

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd nativevitalio
   ```

2. **Sync Gradle**
   - Open in Android Studio
   - Let Gradle sync automatically
   - Ensure all dependencies download successfully

3. **Firebase Setup**
   - `google-services.json` already included
   - Verify Firebase project access
   - Update package name if needed

4. **Omron Libraries**
   - Already included in `app/libs/`
   - No additional setup required

5. **Build Configuration**
   - Update `local.properties` with SDK path if needed
   - Configure signing config for release builds

6. **Run the App**
   ```bash
   ./gradlew installDebug
   ```
   Or use Android Studio's Run button

### Environment Variables / Secrets
- API keys should be moved to secure storage
- Firebase configuration in `google-services.json`
- Check `ApiEndPoint.kt` for API base URLs

---

## 13. Deployment Checklist

### Pre-release
- [ ] Update version code and name in `build.gradle.kts`
- [ ] Generate production signing keystore
- [ ] Configure ProGuard rules properly
- [ ] Test on multiple devices/Android versions
- [ ] Verify all API endpoints point to production
- [ ] Remove any debug/logging code
- [ ] Update Firebase configuration for production
- [ ] Test Omron device connectivity thoroughly
- [ ] Verify all permissions are necessary

### Release
- [ ] Build signed APK/AAB
- [ ] Test release build thoroughly
- [ ] Upload to Google Play Console
- [ ] Update play store listing
- [ ] Monitor crash reports post-release

---

## 14. Maintenance & Support

### Regular Tasks
1. **Dependency Updates:** Check for library updates monthly
2. **Security Patches:** Monitor Firebase and library vulnerabilities
3. **API Changes:** Coordinate with backend team for API updates
4. **Device Compatibility:** Test on new Android versions
5. **Performance Monitoring:** Use Firebase Performance Monitoring

### Common Issues & Solutions

#### Build Issues
- **Sync Failed:** Clean project (`./gradlew clean`) and invalidate caches
- **Missing AAR:** Verify `libs/` folder contains both Omron files
- **Kotlin Version Mismatch:** Ensure IDE uses Kotlin 2.1.0

#### Runtime Issues
- **Crash on Startup:** Check Firebase initialization, network permissions
- **Device Connection Fails:** Verify Bluetooth permissions granted
- **API Failures:** Check network interceptor, auth token validity

---

## 15. Contact & Resources

### Key Files to Reference
- **Entry Point:** `MyApplication.kt` (Application class)
- **Main Activity:** `Splash.kt` → `Login.kt` → `Home.kt`
- **Navigation Graph:** `res/navigation/`
- **API Definitions:** `networking/ApiService.kt`, `utils/ApiEndPoint.kt`
- **Database:** `Database/appDatabase/AppDatabase.kt`

### Documentation Needed
- API documentation from backend team
- Omron device integration guide
- Firebase project access credentials
- Design assets and brand guidelines

---

## 16. Next Steps for New Team

### Immediate Actions
1. Set up development environment following Section 12
2. Build and run the app on a physical device
3. Review architecture and codebase structure
4. Understand the MVVM implementation pattern used
5. Test core features: login, vitals tracking, device connectivity

### Short-term Goals
1. Conduct code review and identify technical debt
2. Set up CI/CD pipeline if not existing
3. Improve test coverage
4. Migrate to scoped storage for Android 11+
5. Implement proper dependency injection (Hilt recommended)

### Long-term Considerations
1. Modularization of the app (multi-module structure)
2. Migration to Compose for modern UI
3. Improve offline-first capabilities
4. Enhance security (encrypted storage, certificate pinning)
5. Optimize app size (currently large due to AAR files)

---

## Appendix A: File Count Summary

| Category | Count |
|----------|-------|
| Kotlin Files | ~325 |
| ViewModels | ~40+ |
| Fragments | ~50+ |
| Data Models | ~50+ |
| Utility Classes | ~100+ |
| Layout XMLs | ~100+ |

---

## Appendix B: Critical Third-Party Services

1. **Firebase** (Analytics, Firestore, Messaging, Installations)
2. **Omron Health Devices** (via custom AAR libraries)
3. **Retrofit/OkHttp** (API communication)
4. **Room Database** (Local storage)
5. **ML Kit** (Barcode scanning)
6. **AppAuth** (OAuth authentication)

---

**Document Created:** $(date +%Y-%m-%d)  
**Last Updated:** $(date +%Y-%m-%d)  
**Prepared By:** AI Code Assistant  

*This document should be reviewed and updated regularly as the project evolves.*
