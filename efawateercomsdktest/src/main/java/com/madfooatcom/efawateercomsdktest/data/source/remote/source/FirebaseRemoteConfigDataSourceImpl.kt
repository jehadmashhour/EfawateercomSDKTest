package com.madfooatcom.efawateercomsdktest.data.source.remote.source

import com.google.android.gms.tasks.Task
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.gson.Gson
import com.madfooatcom.efawateercomsdktest.common.constants.FirebaseConstants
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import com.madfooatcom.efawateercomsdktest.domain.source.RemoteConfigDataSource

internal class FirebaseRemoteConfigDataSourceImpl(
    private val firebaseRemoteConfig: FirebaseRemoteConfig,
    private val gson: Gson
) : RemoteConfigDataSource {
    override fun fetch(minimumFetchIntervalInSeconds: Long): Task<Void> =
        firebaseRemoteConfig.fetch(minimumFetchIntervalInSeconds)

    override fun getConfigurationValue(): String =
        firebaseRemoteConfig.getString(FirebaseConstants.CONFIGURATION)


    override fun getRemoteConfigData(): RemoteConfigData =
        getConfigurationValue().let {
            gson.fromJson(it, RemoteConfigData::class.java).apply {
                configurationValue = it
            }
        }

    override fun activate(): Task<Boolean> = firebaseRemoteConfig.activate()

}