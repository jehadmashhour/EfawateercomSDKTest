package com.madfooatcom.efawateercomsdktest.common.di.module

import com.madfooatcom.efawateercomsdktest.domain.usecases.GetRemoteConfigUseCase
import org.koin.dsl.module

internal val useCaseModule = module {
    factory {
        GetRemoteConfigUseCase(remoteConfigRepository = get())
    }
}