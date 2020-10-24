package com.madfooatcom.efawateercomsdktest.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RemoteConfigData(@PrimaryKey val id: Int, val environment: String) {
    lateinit var configurationValue: String
}
