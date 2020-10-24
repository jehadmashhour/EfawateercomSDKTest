package com.madfooatcom.efawateercomsdktest.common.di.modules

import com.madfooatcom.efawateercomsdktest.common.config.environment.Environment
import org.koin.core.module.Module
import org.koin.dsl.module

fun makeAppModule(environment: Environment): Module = module() {
    single {
        environment
    }
}

