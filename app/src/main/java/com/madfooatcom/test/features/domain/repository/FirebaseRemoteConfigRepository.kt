package com.madfooatcom.test.features.domain.repository

import com.google.android.gms.tasks.Task

interface FirebaseRemoteConfigRepository {
    fun getRemoteConfigData(): Task<Boolean>
}