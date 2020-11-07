package com.madfooatcom.efawateercomsdktest.common.config.gateway

internal interface EfawateercomCallbacks {
    fun init()
    fun launch(paymentConfiguration: PaymentConfiguration)
    fun confirmPayment()
    fun manageWallet()
}