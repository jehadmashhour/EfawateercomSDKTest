package com.madfooatcom.efawateercomsdktest.common.config.environment

import com.madfooatcom.efawateercomsdktest.LocalConstants

internal class DevelopmentEnvironment : BaseEnvironment {
    override val projectId: String
        get() = LocalConstants.Development.projectId

    override val applicationId: String
        get() = LocalConstants.Development.applicationId

    override val apiKey: String
        get() = LocalConstants.Development.apiKey
}