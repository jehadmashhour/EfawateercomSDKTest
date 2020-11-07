package com.madfooatcom.efawateercomsdktest.common.config.environment

import com.madfooatcom.efawateercomsdktest.common.config.environment.BaseEnvironment

enum class EfEnvironment {
    SANDBOX {
        override fun create(): BaseEnvironment = SandboxEnvironment()
    },
    PRODUCTION {
        override fun create(): BaseEnvironment = ProductionEnvironment()
    };

    internal abstract fun create(): BaseEnvironment

}