package com.madfooatcom.test

import android.app.Application
import com.madfooatcom.efawateercomsdktest.common.config.environment.EfEnvironment

import com.madfooatcom.efawateercomsdktest.common.config.gateway.EfLanguage
import com.madfooatcom.efawateercomsdktest.common.config.gateway.EfTheme
import com.madfooatcom.efawateercomsdktest.common.config.gateway.Efawateercom
import com.madfooatcom.efawateercomsdktest.common.config.gateway.EfawateercomConfiguration


class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Efawateercom.init(
            EfawateercomConfiguration.Builder(EfEnvironment.PRODUCTION)
                .language(EfLanguage.ENGLISH)
                .theme(EfTheme.LIGHT)
                .build()
        )
    }
}