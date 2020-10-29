package com.madfooatcom.efawateercomsdktest.common.entrance


import com.madfooatcom.efawateercomsdktest.common.config.environment.Environment
import com.madfooatcom.efawateercomsdktest.common.di.*

import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject




@OptIn(KoinApiExtension::class)
object Efawateercom : KoinComponent {
    fun init(environment: Environment) = initKoin(environment)
    fun launch() = inject<Launcher>().value.launch()
//    1- Firebase Remote Config
//    2- Themes
//    3- Network layer (url session) protocol oriented
//    4- Demo Test App
//    5- Object Configuration (Builder)


}