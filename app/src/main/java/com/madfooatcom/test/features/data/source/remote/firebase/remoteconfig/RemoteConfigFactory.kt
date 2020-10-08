package com.madfooatcom.test.features.data.source.remote.firebase.remoteconfig

import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.huawei.agconnect.remoteconfig.AGConnectConfig
import com.madfooatcom.test.common.extensions.BaseRemoteConfig
import com.madfooatcom.test.common.extensions.baseRemoteConfig

class RemoteConfigFactory(
    private val firebaseRemoteConfig: FirebaseRemoteConfig,
    private val agConnectConfig: AGConnectConfig
) {

    fun getRemoteConfig():BaseRemoteConfig {
        return firebaseRemoteConfig.baseRemoteConfig()
    }
}