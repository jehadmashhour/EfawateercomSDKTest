package com.madfooatcom.efawateercomsdktest.common.config.environment

import com.madfooatcom.efawateercomsdktest.common.constants.FirebaseConstants

class QualityEnvironment : BaseEnvironment {
    override val projectId: String
        get() = FirebaseConstants.Quality.projectId

    override val applicationId: String
        get() = FirebaseConstants.Quality.applicationId

    override val apiKey: String
        get() = FirebaseConstants.Quality.apiKey
}