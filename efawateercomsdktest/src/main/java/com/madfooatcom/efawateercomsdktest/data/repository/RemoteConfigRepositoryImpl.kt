package com.madfooatcom.efawateercomsdktest.data.repository

import org.xms.g.tasks.Task
import org.xms.f.remoteconfig.ExtensionRemoteConfig
import com.madfooatcom.efawateercomsdktest.domain.repository.FirebaseRemoteConfigRepository

class RemoteConfigRepositoryImpl(private val firebaseRemoteConfig: ExtensionRemoteConfig) :
    FirebaseRemoteConfigRepository {

    override fun getRemoteConfigData(): Task<Boolean> = firebaseRemoteConfig.fetchAndActivate();

}