package com.madfooatcom.efawateercomsdktest.common.config.gateway

import java.util.*


class PaymentConfiguration internal constructor(
    val token: String,
    val efUserInfo: EfUserInfo,
    val efPaymentWay: EfPaymentWay,
    val correlationId: String
) {

    data class Builder(
        private val token: String,
        private val efUserInfo: EfUserInfo
    ) {

        private var efPaymentWay: EfPaymentWay = EfPaymentWay.CONTINUOUS
        private var correlationId: String = UUID.randomUUID().toString()

        fun paymentWay(efPaymentWay: EfPaymentWay) =
            apply { this.efPaymentWay = efPaymentWay }

        fun correlationId(correlationId: String) = apply { this.correlationId = correlationId }

        fun build() = PaymentConfiguration(
            token,
            efUserInfo,
            efPaymentWay,
            correlationId
        )
    }
}