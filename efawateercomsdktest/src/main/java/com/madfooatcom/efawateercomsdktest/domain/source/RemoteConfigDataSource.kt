package com.madfooatcom.efawateercomsdktest.domain.source

import com.google.android.gms.tasks.Task
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData

internal interface RemoteConfigDataSource {
    fun fetch(minimumFetchIntervalInSeconds: Long): Task<Void>
    fun getConfigurationValue(): String
    fun getRemoteConfigData(): RemoteConfigData
    fun activate(): Task<Boolean>
}