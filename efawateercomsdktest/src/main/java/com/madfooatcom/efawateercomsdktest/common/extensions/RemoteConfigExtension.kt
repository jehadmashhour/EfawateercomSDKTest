package com.madfooatcom.efawateercomsdktest.common.extensions

import com.google.firebase.remoteconfig.FirebaseRemoteConfig

fun FirebaseRemoteConfig.baseRemoteConfig(): BaseRemoteConfig {
    return BaseRemoteConfig()
}