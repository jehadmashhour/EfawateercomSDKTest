package com.madfooatcom.efawateercomsdktest.data.source.remote.source

import com.google.android.gms.tasks.Task
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.gson.Gson
import com.madfooatcom.efawateercomsdktest.common.constants.FirebaseConstants
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import com.madfooatcom.efawateercomsdktest.domain.source.RemoteConfigDataSource

class RemoteConfigDataSourceImpl(
    private val firebaseRemoteConfig: FirebaseRemoteConfig,
    private val gson: Gson
) :
    RemoteConfigDataSource {
    override fun fetch(minimumFetchIntervalInSeconds: Long): Task<Void> =
        firebaseRemoteConfig.fetch(minimumFetchIntervalInSeconds)

    override fun getRemoteConfigData(): RemoteConfigData = gson.fromJson(
        firebaseRemoteConfig.getString(FirebaseConstants.CONFIGURATION),
        RemoteConfigData::class.java
    )

    override fun activate(): Task<Boolean> = firebaseRemoteConfig.activate()

}