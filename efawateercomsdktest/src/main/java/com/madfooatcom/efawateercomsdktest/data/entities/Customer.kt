package com.madfooatcom.efawateercomsdktest.data.entities

import com.google.gson.annotations.SerializedName

internal data class Customer(

	@field:SerializedName("GetAllSavedBill")
	val getAllSavedBill: String? = null,

	@field:SerializedName("InsertWUAccountActivation")
	val insertWUAccountActivation: String? = null,

	@field:SerializedName("ChangeCustomerMobileNo")
	val changeCustomerMobileNo: String? = null,

	@field:SerializedName("UpdateAccountSettings")
	val updateAccountSettings: String? = null,

	@field:SerializedName("ChangeTempPassword")
	val changeTempPassword: String? = null,

	@field:SerializedName("GetAllPaymentHistory")
	val getAllPaymentHistory: String? = null,

	@field:SerializedName("CheckWUAccountActivationStatus")
	val checkWUAccountActivationStatus: String? = null,

	@field:SerializedName("SubmitCustomerTicket")
	val submitCustomerTicket: String? = null,

	@field:SerializedName("ReActivateCustomer")
	val reActivateCustomer: String? = null,

	@field:SerializedName("GetAccountSettings")
	val getAccountSettings: String? = null,

	@field:SerializedName("DeactivateAccount")
	val deactivateAccount: String? = null,

	@field:SerializedName("SendPaymentReceipt")
	val sendPaymentReceipt: String? = null
)