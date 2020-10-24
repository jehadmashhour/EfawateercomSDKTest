package com.madfooatcom.efawateercomsdktest.common.di

import android.content.Context
import com.madfooatcom.efawateercomsdktest.common.config.environment.Environment
import com.madfooatcom.efawateercomsdktest.common.di.modules.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


fun initKoin(context: Context, environment: Environment) {
    startKoin {
        androidContext(context)
        modules(
            listOf(
                makeAppModule(environment),
                databaseModule,
                firebaseModule,
                networkModule,
                repositoryModule,
                useCaseModule,
                viewModelModule
            )
        )
    }

}
