package com.madfooatcom.efawateercomsdktest.common.config.environment

import com.madfooatcom.efawateercomsdktest.common.constants.FirebaseConstants

internal class SandboxEnvironment : BaseEnvironment {
    override val projectId: String
        get() = FirebaseConstants.Sandbox.projectId

    override val applicationId: String
        get() = FirebaseConstants.Sandbox.applicationId

    override val apiKey: String
        get() = FirebaseConstants.Sandbox.apiKey
}