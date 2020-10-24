package com.madfooatcom.efawateercomsdktest.common.config.paymentgateway

import android.content.Context
import android.content.Intent
import android.os.Handler
import android.os.Looper
import com.madfooatcom.efawateercomsdktest.TestActivity
import com.madfooatcom.efawateercomsdktest.common.config.environment.Environment
import com.madfooatcom.efawateercomsdktest.common.di.*


object EfawateercomPaymentGateway {
    fun init(context: Context, environment: Environment) = initKoin(context, environment)
    fun launch(context: Context) = context.startActivity(Intent(context, TestActivity::class.java))
}