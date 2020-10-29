package com.madfooatcom.efawateercomsdktest.common.di.modules

import com.madfooatcom.efawateercomsdktest.data.repository.RemoteConfigRepositoryImpl
import com.madfooatcom.efawateercomsdktest.data.source.remote.source.FirebaseRemoteConfigDataSourceImpl
import com.madfooatcom.efawateercomsdktest.domain.repository.RemoteConfigRepository

import org.koin.dsl.module

internal val repositoryModule = module {
    single {
        FirebaseRemoteConfigDataSourceImpl(firebaseRemoteConfig = get(), gson = get())
    }

    single {
        RemoteConfigRepositoryImpl(firebaseRemoteConfigDataSourceImpl = get()) as RemoteConfigRepository
    }
}