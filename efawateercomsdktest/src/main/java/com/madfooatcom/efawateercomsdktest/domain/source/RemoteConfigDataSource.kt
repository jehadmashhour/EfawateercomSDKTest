package com.madfooatcom.efawateercomsdktest.domain.source

import com.google.android.gms.tasks.Task
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import io.reactivex.rxjava3.core.Maybe

interface RemoteConfigDataSource {
    fun fetch(minimumFetchIntervalInSeconds:Long): Task<Void>
    fun getRemoteConfigData(): RemoteConfigData
    fun activate():Task<Boolean>
}