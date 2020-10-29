package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class SecureCheckout(

	@field:SerializedName("SCPreparePayment")
	val sCPreparePayment: String? = null,

	@field:SerializedName("SCUpdateWalletManagement")
	val sCUpdateWalletManagement: String? = null,

	@field:SerializedName("SCCalculateCardFees")
	val sCCalculateCardFees: String? = null,

	@field:SerializedName("SCValidateTransaction")
	val sCValidateTransaction: String? = null,

	@field:SerializedName("SCUpdateGetCards")
	val sCUpdateGetCards: String? = null,

	@field:SerializedName("SCUpdatePayment")
	val sCUpdatePayment: String? = null,

	@field:SerializedName("SCPrepareWalletManagement")
	val sCPrepareWalletManagement: String? = null
)