package com.madfooatcom.test

import android.app.Application
import com.madfooatcom.efawateercomsdktest.common.config.environment.Environment
import com.madfooatcom.efawateercomsdktest.common.config.paymentgateway.EfawateercomPaymentGateway

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        EfawateercomPaymentGateway.init(this, Environment.SANDBOX)
    }
}