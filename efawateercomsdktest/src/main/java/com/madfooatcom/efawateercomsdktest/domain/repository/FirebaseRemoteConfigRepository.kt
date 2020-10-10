package com.madfooatcom.efawateercomsdktest.domain.repository

import org.xms.g.tasks.Task

interface FirebaseRemoteConfigRepository {
    fun getRemoteConfigData(): Task<Boolean>
}