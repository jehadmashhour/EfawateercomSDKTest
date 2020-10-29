package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class RemoteConfigData(

	@SerializedName("Configuration")
	val configuration: Configuration? = null
) {
    lateinit var configurationValue: String
}