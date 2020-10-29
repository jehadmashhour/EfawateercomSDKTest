package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class LAPM(

	@field:SerializedName("DPGetPaymentByLapmId")
	val dPGetPaymentByLapmId: String? = null,

	@field:SerializedName("DPGetAllParticipant")
	val dPGetAllParticipant: String? = null,

	@field:SerializedName("DPResendOTP")
	val dPResendOTP: String? = null,

	@field:SerializedName("DPGetParticipantIdentification")
	val dPGetParticipantIdentification: String? = null,

	@field:SerializedName("DPPayment")
	val dPPayment: String? = null,

	@field:SerializedName("DPGetSavedAccount")
	val dPGetSavedAccount: String? = null,

	@field:SerializedName("DPGetTermsAndCondition")
	val dPGetTermsAndCondition: String? = null,

	@field:SerializedName("DPSaveAccount")
	val dPSaveAccount: String? = null
)