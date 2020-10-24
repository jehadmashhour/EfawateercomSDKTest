package com.madfooatcom.efawateercomsdktest.data.source.local.roomdb.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import io.reactivex.Maybe


@Dao
interface RemoteConfigDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveRemoteConfigData(remoteConfigData: RemoteConfigData)


    @Query("SELECT * FROM remoteconfigdata")
    fun getRemoteConfigData(): Maybe<RemoteConfigData>

}