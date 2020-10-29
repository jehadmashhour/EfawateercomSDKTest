package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Messages(

	@field:SerializedName("Warning")
	val warning: Warning? = null,

	@field:SerializedName("Error")
	val error: Error? = null,

	@field:SerializedName("Info")
	val info: Info? = null,

	@field:SerializedName("Success")
	val success: Success? = null
)