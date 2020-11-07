package com.madfooatcom.efawateercomsdktest

import com.madfooatcom.efawateercomsdktest.common.config.environment.BaseEnvironment
import com.madfooatcom.efawateercomsdktest.common.config.environment.DevelopmentEnvironment
import com.madfooatcom.efawateercomsdktest.common.config.environment.QualityEnvironment


enum class EfEnvironment {
    DEVELOPMENT {
        override fun create(): BaseEnvironment = DevelopmentEnvironment()
    },
    QUALITY {
        override fun create(): BaseEnvironment = QualityEnvironment()
    };

    internal abstract fun create(): BaseEnvironment

}