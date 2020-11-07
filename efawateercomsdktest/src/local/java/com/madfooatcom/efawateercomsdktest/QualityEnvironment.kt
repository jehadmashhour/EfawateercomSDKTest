package com.madfooatcom.efawateercomsdktest.common.config.environment

import com.madfooatcom.efawateercomsdktest.LocalConstants

internal class QualityEnvironment : BaseEnvironment {
    override val projectId: String
        get() = LocalConstants.Quality.projectId

    override val applicationId: String
        get() = LocalConstants.Quality.applicationId

    override val apiKey: String
        get() = LocalConstants.Quality.apiKey
}