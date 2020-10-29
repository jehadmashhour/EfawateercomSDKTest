package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Certificate(

	@field:SerializedName("IsMobileAPIsMessageSigningEnabled")
	val isMobileAPIsMessageSigningEnabled: Boolean? = null,

	@field:SerializedName("HashedCerPublicKey")
	val hashedCerPublicKey: String? = null,

	@field:SerializedName("PFXPassword")
	val pFXPassword: String? = null
)