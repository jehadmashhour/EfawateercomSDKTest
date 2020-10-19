package com.madfooatcom.efawateercomsdktest.domain.repository

import com.google.android.gms.tasks.Task
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import io.reactivex.rxjava3.core.Maybe


interface ConfigRepository {
    fun getRemoteConfigData(/*isFromCache: Boolean*/): Maybe<RemoteConfigData>
}