package com.madfooatcom.efawateercomsdktest.common.config.environment

enum class Environment {
    DEVELOPMENT {
        override fun create(): BaseEnvironment = DevelopmentEnvironment()
    },
    QUALITY {
        override fun create(): BaseEnvironment = QualityEnvironment()
    },
    SANDBOX {
        override fun create(): BaseEnvironment = SandboxEnvironment()
    },
    PRODUCTION {
        override fun create(): BaseEnvironment  = ProductionEnvironment()
    };

    abstract fun create(): BaseEnvironment

}