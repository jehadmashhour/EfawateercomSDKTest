package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class App(

	@field:SerializedName("Google")
	val google: Google? = null,

	@field:SerializedName("Environment")
	val environment: Environment? = null,

	@field:SerializedName("Image")
	val image: Image? = null,

	@field:SerializedName("Certificate")
	val certificate: Certificate? = null
)