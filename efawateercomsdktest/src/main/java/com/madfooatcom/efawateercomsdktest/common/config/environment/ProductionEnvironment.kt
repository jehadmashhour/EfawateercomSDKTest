package com.madfooatcom.efawateercomsdktest.common.config.environment

import com.madfooatcom.efawateercomsdktest.common.config.environment.BaseEnvironment

internal class ProductionEnvironment : BaseEnvironment {
    override val projectId: String
        get() = LiveConstants.Production.projectId

    override val applicationId: String
        get() = LiveConstants.Production.applicationId

    override val apiKey: String
        get() = LiveConstants.Production.apiKey
}