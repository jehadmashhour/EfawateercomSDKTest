package com.madfooatcom.efawateercomsdktest.data.source.remote.firebase.remoteconfig

import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.huawei.agconnect.remoteconfig.AGConnectConfig
import com.madfooatcom.efawateercomsdktest.common.extensions.BaseRemoteConfig
import com.madfooatcom.efawateercomsdktest.common.extensions.baseRemoteConfig

class RemoteConfigFactory(
    private val firebaseRemoteConfig: FirebaseRemoteConfig,
    private val agConnectConfig: AGConnectConfig
) {

    fun getRemoteConfig():BaseRemoteConfig {
        return firebaseRemoteConfig.baseRemoteConfig()
    }
}