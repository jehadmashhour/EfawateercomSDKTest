package com.madfooatcom.efawateercomsdktest.data.source.local.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import com.madfooatcom.efawateercomsdktest.data.source.local.roomdb.dao.RemoteConfigDao

@Database(entities = [RemoteConfigData::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun firebaseRemoteConfigDao(): RemoteConfigDao

    companion object {
        const val DB_NAME = "EfawateercomSDK.db"
    }
}