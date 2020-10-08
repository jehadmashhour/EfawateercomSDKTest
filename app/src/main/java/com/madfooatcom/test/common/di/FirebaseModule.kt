package com.madfooatcom.test.common.di

import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings
import com.huawei.agconnect.remoteconfig.AGConnectConfig
import org.koin.dsl.module

fun AGConnectConfig.Gasf()
{

}
val firebaseModule = module {
    single {
        Firebase.remoteConfig.apply {
            val configSettings = remoteConfigSettings {
                minimumFetchIntervalInSeconds = 3600
            }
            setConfigSettingsAsync(configSettings)
        }

    }
}
