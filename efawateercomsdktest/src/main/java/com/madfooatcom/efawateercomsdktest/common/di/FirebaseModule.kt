package com.madfooatcom.efawateercomsdktest.common.di

import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings

import org.koin.dsl.module


val firebaseModule = module {
    single {
        val options = FirebaseOptions.Builder()
            .setProjectId("efawateercomsdktest")
            .setApplicationId("1:859095255496:android:e2f84560dc371d6d7798fd")
            .setApiKey("AIzaSyAFbdEp6gtSW7f6wKhjB4qOEYgLHbBfjzU")
            .build()

        FirebaseApp.initializeApp(get(), options, "EfawateercomSDKTest")
    }
    single {
        Firebase.remoteConfig(get()).apply {
            val configSettings = remoteConfigSettings {
                minimumFetchIntervalInSeconds = 3600
            }
            setConfigSettingsAsync(configSettings)
        }
    }
}
