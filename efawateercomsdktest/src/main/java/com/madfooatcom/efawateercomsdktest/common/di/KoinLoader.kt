package com.madfooatcom.efawateercomsdktest.common.di

import com.madfooatcom.efawateercomsdktest.BuildConfig
import com.madfooatcom.efawateercomsdktest.common.config.environment.Environment
import com.madfooatcom.efawateercomsdktest.common.di.modules.*
import com.madfooatcom.efawateercomsdktest.common.provider.ApplicationContextProvider
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


internal fun initKoin(environment: Environment) {
    startKoin {
        androidContext(ApplicationContextProvider.applicationContext)
        if (environment != Environment.PRODUCTION || BuildConfig.DEBUG) {
            androidLogger()
        }
        modules(
            listOf(
                makeAppModule(environment),
//                databaseModule,
                firebaseModule,
                networkModule,
                repositoryModule,
                useCaseModule,
                viewModelModule
            )
        )
    }
}

