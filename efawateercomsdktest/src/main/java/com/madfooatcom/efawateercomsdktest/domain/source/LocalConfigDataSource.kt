package com.madfooatcom.efawateercomsdktest.domain.source

import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import io.reactivex.Maybe


internal interface LocalConfigDataSource {
    fun saveRemoteConfigData(remoteConfigData: RemoteConfigData)

    fun getRemoteConfigData(): Maybe<RemoteConfigData>
}