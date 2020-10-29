package com.madfooatcom.efawateercomsdktest.domain.repository

import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import io.reactivex.Single


internal interface RemoteConfigRepository {
    fun getRemoteConfigData(minimumFetchIntervalInSeconds: Long): Single<RemoteConfigData>
}