package com.madfooatcom.efawateercomsdktest.domain.source

import com.google.android.gms.tasks.Task
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import io.reactivex.Maybe


interface LocalConfigDataSource {
    fun saveRemoteConfigData(remoteConfigData: RemoteConfigData)

    fun getRemoteConfigData(): Maybe<RemoteConfigData>
}