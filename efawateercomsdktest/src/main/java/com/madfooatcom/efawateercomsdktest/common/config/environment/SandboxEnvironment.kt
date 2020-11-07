package com.madfooatcom.efawateercomsdktest.common.config.environment

import com.madfooatcom.efawateercomsdktest.common.config.environment.BaseEnvironment

internal class SandboxEnvironment : BaseEnvironment {
    override val projectId: String
        get() = LiveConstants.Sandbox.projectId

    override val applicationId: String
        get() = LiveConstants.Sandbox.applicationId

    override val apiKey: String
        get() = LiveConstants.Sandbox.apiKey
}