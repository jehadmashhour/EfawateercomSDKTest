package com.madfooatcom.efawateercomsdktest.common.di.module

import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions

import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings
import com.madfooatcom.efawateercomsdktest.R
import com.madfooatcom.efawateercomsdktest.common.config.gateway.EfawateercomConfiguration
import com.madfooatcom.efawateercomsdktest.common.constant.FirebaseConstants
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module


internal val firebaseModule = module {
    single {
        val options = FirebaseOptions.Builder()
            .setProjectId(get<EfawateercomConfiguration>().environment.create().projectId)
            .setApplicationId(get<EfawateercomConfiguration>().environment.create().applicationId)
            .setApiKey(get<EfawateercomConfiguration>().environment.create().apiKey)
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
                minimumFetchIntervalInSeconds =
                    FirebaseConstants.REMOTE_CONFIG_CACHE_EXPIRATION_VALUE
            }
            setConfigSettingsAsync(configSettings)
        }
    }

//    single {
//        get<FirebaseApp>().get(FirebaseCrashlytics::class.java) as FirebaseCrashlytics
//    }
}

internal fun loadRemoteConfigDataModule(remoteConfigData: RemoteConfigData) =
    loadKoinModules(module {
        single(override = true) {
            remoteConfigData
        }
    })





