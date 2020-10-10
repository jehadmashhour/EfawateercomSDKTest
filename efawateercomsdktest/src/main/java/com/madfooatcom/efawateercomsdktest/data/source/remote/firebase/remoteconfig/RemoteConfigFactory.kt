package com.madfooatcom.efawateercomsdktest.data.source.remote.firebase.remoteconfig

import org.xms.f.remoteconfig.ExtensionRemoteConfig
import com.huawei.agconnect.remoteconfig.AGConnectConfig
import com.madfooatcom.efawateercomsdktest.common.extensions.BaseRemoteConfig
import com.madfooatcom.efawateercomsdktest.common.extensions.baseRemoteConfig

class RemoteConfigFactory(
    private val firebaseRemoteConfig: ExtensionRemoteConfig,
    private val agConnectConfig: AGConnectConfig
) {

    fun getRemoteConfig():BaseRemoteConfig {
        return firebaseRemoteConfig.baseRemoteConfig()
    }
}