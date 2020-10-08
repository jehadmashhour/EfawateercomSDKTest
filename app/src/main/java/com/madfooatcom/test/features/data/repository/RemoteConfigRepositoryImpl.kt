package com.madfooatcom.test.features.data.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.madfooatcom.test.features.domain.repository.FirebaseRemoteConfigRepository

class RemoteConfigRepositoryImpl(private val firebaseRemoteConfig: FirebaseRemoteConfig) :
    FirebaseRemoteConfigRepository {

    override fun getRemoteConfigData(): Task<Boolean> = firebaseRemoteConfig.fetchAndActivate();

}