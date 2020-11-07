package com.madfooatcom.efawateercomsdktest.common.di.module

import com.madfooatcom.efawateercomsdktest.common.config.gateway.EfawateercomConfiguration
import com.madfooatcom.efawateercomsdktest.common.config.gateway.EfawateercomCreator
import com.madfooatcom.efawateercomsdktest.common.config.gateway.PaymentConfiguration
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module


val efawateercomModule = module {
    factory {
        EfawateercomCreator(get())
    }
}

internal fun getEfawateercomConfigurationModule(
    efawateercomConfiguration: EfawateercomConfiguration
): Module = module {
    single {
        efawateercomConfiguration
    }

}

internal fun loadEfawateercomPaymentModule(paymentConfiguration: PaymentConfiguration) =
    loadKoinModules(module {
        single(override = true) {
            paymentConfiguration
        }
    })



