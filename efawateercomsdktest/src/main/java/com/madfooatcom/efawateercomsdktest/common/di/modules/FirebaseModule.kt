package com.madfooatcom.efawateercomsdktest.common.di.modules

import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions

import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings
import com.madfooatcom.efawateercomsdktest.R
import com.madfooatcom.efawateercomsdktest.common.config.environment.Environment
import com.madfooatcom.efawateercomsdktest.common.constants.FirebaseConstants
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val firebaseModule = module {
    single {
        val options = FirebaseOptions.Builder()
            .setProjectId(get<Environment>().create().projectId)
            .setApplicationId(get<Environment>().create().applicationId)
            .setApiKey(get<Environment>().create().apiKey)
            .build()

        FirebaseApp.initializeApp(
            androidContext(),
            options,
            androidContext().getString(R.string.e_name)
        )
    }
    single {
        Firebase.remoteConfig(get()).apply {
            val configSettings = remoteConfigSettings {
                minimumFetchIntervalInSeconds = FirebaseConstants.REMOTE_CONFIG_CACHE_EXPIRATION
            }
            setConfigSettingsAsync(configSettings)
        }
    }

//    single {
//        get<FirebaseApp>().get(FirebaseCrashlytics::class.java) as FirebaseCrashlytics
//    }
}

fun makeRemoteConfigDataModule(remoteConfigData: RemoteConfigData) = module {
    single(override = true) {
        remoteConfigData
    }
}





