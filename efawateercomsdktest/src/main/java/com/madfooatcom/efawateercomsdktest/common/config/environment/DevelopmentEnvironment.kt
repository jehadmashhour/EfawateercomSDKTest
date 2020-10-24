package com.madfooatcom.efawateercomsdktest.common.config.environment

import com.madfooatcom.efawateercomsdktest.common.constants.FirebaseConstants

class DevelopmentEnvironment : BaseEnvironment {
    override val projectId: String
        get() = FirebaseConstants.Development.projectId

    override val applicationId: String
        get() = FirebaseConstants.Development.applicationId

    override val apiKey: String
        get() = FirebaseConstants.Development.apiKey
}