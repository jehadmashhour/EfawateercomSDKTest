package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Lookups(

	@field:SerializedName("GetLookup")
	val getLookup: String? = null,

	@field:SerializedName("GetCountries")
	val getCountries: String? = null,

	@field:SerializedName("GetLanguages")
	val getLanguages: String? = null,

	@field:SerializedName("GetAppSettings")
	val getAppSettings: String? = null,

	@field:SerializedName("GetMTSubPaymentByPaymentChannelId")
	val getMTSubPaymentByPaymentChannelId: String? = null
)