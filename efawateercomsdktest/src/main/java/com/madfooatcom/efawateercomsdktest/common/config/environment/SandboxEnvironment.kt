package com.madfooatcom.efawateercomsdktest.common.config.environment

import com.madfooatcom.efawateercomsdktest.common.constants.FirebaseConstants

class SandboxEnvironment : BaseEnvironment {
    override val projectId: String
        get() = FirebaseConstants.Staging.projectId

    override val applicationId: String
        get() = FirebaseConstants.Staging.applicationId

    override val apiKey: String
        get() = FirebaseConstants.Staging.apiKey
}