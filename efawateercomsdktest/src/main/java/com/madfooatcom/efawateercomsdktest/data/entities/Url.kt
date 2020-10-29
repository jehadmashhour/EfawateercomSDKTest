package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Url(

	@field:SerializedName("LAPM")
	val lAPM: LAPM? = null,

	@field:SerializedName("SecureCheckout")
	val secureCheckout: SecureCheckout? = null,

	@field:SerializedName("Customer")
	val customer: Customer? = null,

	@field:SerializedName("Authentication")
	val authentication: Authentication? = null,

	@field:SerializedName("Registration")
	val registration: Registration? = null,

	@field:SerializedName("Presentment")
	val presentment: Presentment? = null,

	@field:SerializedName("Lookups")
	val lookups: Lookups? = null
)