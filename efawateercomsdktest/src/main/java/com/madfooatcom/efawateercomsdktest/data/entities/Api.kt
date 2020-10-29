package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Api(

	@field:SerializedName("Messages")
	val messages: Messages? = null,

	@field:SerializedName("Port")
	val port: String? = null,

	@field:SerializedName("BaseUrl")
	val baseUrl: String? = null,

	@field:SerializedName("Url")
	val url: Url? = null
)