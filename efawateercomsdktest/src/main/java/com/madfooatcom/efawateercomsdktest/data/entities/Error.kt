package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Error(

	@field:SerializedName("SocketTimeoutMessage")
	val socketTimeoutMessage: String? = null,

	@field:SerializedName("InvalidSignatureMessage")
	val invalidSignatureMessage: String? = null,

	@field:SerializedName("ErrorMessage")
	val errorMessage: String? = null
)