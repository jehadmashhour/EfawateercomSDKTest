package com.madfooatcom.efawateercomsdktest.domain.repository

import com.madfooatcom.efawateercomsdktest.common.constants.FirebaseConstants
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import io.reactivex.Single


interface RemoteConfigRepository {
    fun getRemoteConfigData(minimumFetchIntervalInSeconds: Long): Single<RemoteConfigData>
}