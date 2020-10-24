package com.madfooatcom.efawateercomsdktest.common.di.modules

import com.madfooatcom.efawateercomsdktest.data.repository.RemoteConfigRepositoryImpl
import com.madfooatcom.efawateercomsdktest.data.source.remote.source.FirebaseRemoteConfigDataSourceImpl
import com.madfooatcom.efawateercomsdktest.domain.usecases.GetRemoteConfigUseCase
import org.koin.dsl.module

val useCaseModule = module {
    factory {
        GetRemoteConfigUseCase(remoteConfigRepository = get())
    }
}