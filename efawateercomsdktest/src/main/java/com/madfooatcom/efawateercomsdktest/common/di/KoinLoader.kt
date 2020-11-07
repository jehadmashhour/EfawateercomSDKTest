package com.madfooatcom.efawateercomsdktest.common.di

import com.madfooatcom.efawateercomsdktest.BuildConfig
import com.madfooatcom.efawateercomsdktest.EfEnvironment
import com.madfooatcom.efawateercomsdktest.common.di.module.*
import com.madfooatcom.efawateercomsdktest.common.config.gateway.EfawateercomConfiguration
import com.madfooatcom.efawateercomsdktest.common.provider.ApplicationContextProvider
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


internal fun initKoin(
    efawateercomConfiguration: EfawateercomConfiguration
) {
    startKoin {
        androidContext(ApplicationContextProvider.applicationContext!!)
        if (efawateercomConfiguration.environment != EfEnvironment.PRODUCTION || BuildConfig.DEBUG) {
            androidLogger()
        }
        modules(
            listOf(
                getEfawateercomConfigurationModule(efawateercomConfiguration),
                efawateercomModule,
                firebaseModule,
                networkModule,
                repositoryModule,
                useCaseModule,
                viewModelModule
            )
        )
    }
}

