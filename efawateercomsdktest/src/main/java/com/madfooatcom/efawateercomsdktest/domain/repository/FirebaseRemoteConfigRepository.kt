package com.madfooatcom.efawateercomsdktest.domain.repository

import com.google.android.gms.tasks.Task

interface FirebaseRemoteConfigRepository {
    fun getRemoteConfigData(): Task<Boolean>
}