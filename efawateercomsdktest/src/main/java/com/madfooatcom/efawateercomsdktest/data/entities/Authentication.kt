package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Authentication(

	@field:SerializedName("Logout")
	internal val logout: String? = null,

	@field:SerializedName("Login")
	internal val login: String? = null,

	@field:SerializedName("UpdateFcmToken")
	internal val updateFcmToken: String? = null
)
