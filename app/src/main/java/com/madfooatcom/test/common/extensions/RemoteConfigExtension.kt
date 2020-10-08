package com.madfooatcom.test.common.extensions

import com.google.firebase.remoteconfig.FirebaseRemoteConfig

fun FirebaseRemoteConfig.baseRemoteConfig(): BaseRemoteConfig {
    return BaseRemoteConfig()
}