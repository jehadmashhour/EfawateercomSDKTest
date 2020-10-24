package com.madfooatcom.efawateercomsdktest.data.source.local.source

import com.google.android.gms.tasks.Task
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import com.madfooatcom.efawateercomsdktest.data.source.local.roomdb.AppDatabase
import com.madfooatcom.efawateercomsdktest.data.source.local.roomdb.dao.RemoteConfigDao
import com.madfooatcom.efawateercomsdktest.domain.source.LocalConfigDataSource
import io.reactivex.Maybe


class LocalConfigDataSourceImpl(private val remoteConfigDao: RemoteConfigDao) : LocalConfigDataSource {
    override fun saveRemoteConfigData(remoteConfigData: RemoteConfigData) {
    }
    override fun getRemoteConfigData(): Maybe<RemoteConfigData> = remoteConfigDao.getRemoteConfigData()

}