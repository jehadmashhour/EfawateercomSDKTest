package com.madfooatcom.efawateercomsdktest.common.config.environment

import com.madfooatcom.efawateercomsdktest.common.constants.FirebaseConstants

class ProductionEnvironment : BaseEnvironment {
    override val projectId: String
        get() = FirebaseConstants.Production.projectId

    override val applicationId: String
        get() = FirebaseConstants.Production.applicationId

    override val apiKey: String
        get() = FirebaseConstants.Production.apiKey
}