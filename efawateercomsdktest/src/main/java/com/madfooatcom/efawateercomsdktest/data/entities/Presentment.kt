package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Presentment(

	@field:SerializedName("GetCategories")
	val getCategories: String? = null,

	@field:SerializedName("GetPrepaidCategory")
	val getPrepaidCategory: String? = null,

	@field:SerializedName("GetServicesForMeterSelfReading")
	val getServicesForMeterSelfReading: String? = null,

	@field:SerializedName("GetBillerServices")
	val getBillerServices: String? = null,

	@field:SerializedName("InsertMeterSelfReading")
	val insertMeterSelfReading: String? = null,

	@field:SerializedName("ValidateMeterInfo")
	val validateMeterInfo: String? = null,

	@field:SerializedName("GetBillers")
	val getBillers: String? = null,

	@field:SerializedName("Presentment")
	val presentment: String? = null,

	@field:SerializedName("GetPresentmentById")
	val getPresentmentById: String? = null,

	@field:SerializedName("GenerateSendBillShortLink")
	val generateSendBillShortLink: String? = null,

	@field:SerializedName("SaveBill")
	val saveBill: String? = null
)