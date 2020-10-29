package com.madfooatcom.test

import android.app.Application
import com.madfooatcom.efawateercomsdktest.common.config.environment.Environment
import com.madfooatcom.efawateercomsdktest.common.entrance.Efawateercom


 class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Efawateercom.init(Environment.PRODUCTION)
    }
}