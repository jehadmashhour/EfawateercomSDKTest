package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Registration(

	@field:SerializedName("ChangePassword")
	val changePassword: String? = null,

	@field:SerializedName("Signup")
	val signup: String? = null,

	@field:SerializedName("GenerateOTP")
	val generateOTP: String? = null,

	@field:SerializedName("ValidateDocumentNo")
	val validateDocumentNo: String? = null,

	@field:SerializedName("RequestNewOTP")
	val requestNewOTP: String? = null,

	@field:SerializedName("VerifyOTP")
	val verifyOTP: String? = null
)