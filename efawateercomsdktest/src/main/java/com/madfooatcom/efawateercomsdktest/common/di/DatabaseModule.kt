package com.madfooatcom.efawateercomsdktest.common.di

import androidx.room.Room
import com.madfooatcom.efawateercomsdktest.data.source.local.roomdb.AppDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(androidApplication(), AppDatabase::class.java, AppDatabase.DB_NAME)
            .build()
    }

    single { get<AppDatabase>().firebaseRemoteConfigDao() }
}