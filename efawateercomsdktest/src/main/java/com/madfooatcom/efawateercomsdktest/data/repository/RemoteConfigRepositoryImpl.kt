package com.madfooatcom.efawateercomsdktest.data.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.madfooatcom.efawateercomsdktest.domain.repository.FirebaseRemoteConfigRepository

class RemoteConfigRepositoryImpl(private val firebaseRemoteConfig: FirebaseRemoteConfig) :
    FirebaseRemoteConfigRepository {

    override fun getRemoteConfigData(): Task<Boolean> = firebaseRemoteConfig.fetchAndActivate();

}