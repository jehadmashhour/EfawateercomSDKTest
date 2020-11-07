package com.madfooatcom.efawateercomsdktest.common.config.gateway


import com.madfooatcom.efawateercomsdktest.common.di.initKoin

import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


@OptIn(KoinApiExtension::class)
object Efawateercom : KoinComponent {
    private val efawateercomCreator by inject<EfawateercomCreator>()


    @JvmStatic
    fun init(
        efawateercomConfiguration: EfawateercomConfiguration
    ) = initKoin(efawateercomConfiguration).also {
        efawateercomCreator.init()
    }

    @JvmStatic
    fun launch(paymentConfiguration: PaymentConfiguration) =
        efawateercomCreator.launch(paymentConfiguration)

    @JvmStatic
    fun confirmPayment() = efawateercomCreator.confirmPayment()


    @JvmStatic
    fun manageWallet() = efawateercomCreator.manageWallet()


//    1- Firebase Remote Config
//    2- Themes
//    3- Network layer (url session) protocol oriented
//    4- Demo Test App
//    5- Object Configuration (Builder)


}