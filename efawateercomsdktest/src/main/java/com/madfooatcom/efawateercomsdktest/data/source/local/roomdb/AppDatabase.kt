package com.madfooatcom.efawateercomsdktest.data.source.local.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import com.madfooatcom.efawateercomsdktest.data.source.local.roomdb.dao.RemoteConfigDao

@Database(
    entities = [RemoteConfigData::class],
    version = AppDatabase.DB_VERSION,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun firebaseRemoteConfigDao(): RemoteConfigDao

    companion object {
        const val DB_NAME = "EfawateercomSDK.db"
        const val DB_VERSION = 1
    }
}