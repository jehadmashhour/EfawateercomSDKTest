package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Configuration(

	@field:SerializedName("App")
	val app: App? = null,

	@field:SerializedName("Api")
	val api: Api? = null
)