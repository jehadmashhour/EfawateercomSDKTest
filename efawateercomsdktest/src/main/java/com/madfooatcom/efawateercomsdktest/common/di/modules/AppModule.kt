package com.madfooatcom.efawateercomsdktest.common.di.modules

import com.madfooatcom.efawateercomsdktest.common.config.environment.Environment
import com.madfooatcom.efawateercomsdktest.common.entrance.Launcher
import org.koin.core.module.Module
import org.koin.dsl.module


internal fun makeAppModule(environment: Environment): Module = module() {
    single {
        environment
    }

    factory {
        Launcher(get())
    }
}

