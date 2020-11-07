package com.madfooatcom.efawateercomsdktest.common.config.gateway


class EfUserInfo private constructor(
    val userId: String,
    val userPhoneOrEmail: String,
    val userName: String?,
    val userPhone: String?,
    val userEmail: String?
) {

    data class Builder(
        val userId: String,
        val userPhoneOrEmail: String
    ) {

        private var userName: String? = null
        private var userPhone: String? = null
        private var userEmail: String? = null

        fun userName(userName: String) = apply { this.userName = userName }
        fun userPhone(userPhone: String) = apply { this.userPhone = userPhone }
        fun userEmail(userEmail: String) = apply { this.userEmail = userEmail }

        fun build() = EfUserInfo(
            userId,
            userPhoneOrEmail,
            userName,
            userPhone,
            userEmail
        )
    }
}