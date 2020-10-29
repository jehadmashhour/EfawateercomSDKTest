package com.madfooatcom.efawateercomsdktest.common.constants


internal object FirebaseConstants {
    const val REMOTE_CONFIG_CACHE_EXPIRATION_KEY: String = "remote_config_cache_expiration_key"
    const val REMOTE_CONFIG_CACHE_EXPIRATION_VALUE: Long = 3600
    const val CONFIGURATION = "configuration"

    internal object Development {
        const val projectId = "efawateercomsdktest"
        const val applicationId = "1:859095255496:android:cb62e538b673ac9a7798fd"
        const val apiKey = "AIzaSyAFbdEp6gtSW7f6wKhjB4qOEYgLHbBfjzU"
    }

    internal object Quality {
        const val projectId = "efawateercomsdktest"
        const val applicationId = "1:859095255496:android:61bdb57221521aab7798fd"
        const val apiKey = "AIzaSyAFbdEp6gtSW7f6wKhjB4qOEYgLHbBfjzU"
    }

    internal object Sandbox {
        const val projectId = "efawateercomsdktest"
        const val applicationId = "1:859095255496:android:cfe3a2e8d357169f7798fd"
        const val apiKey = "AIzaSyAFbdEp6gtSW7f6wKhjB4qOEYgLHbBfjzU"
    }

    internal object Production {
        const val projectId = "efawateercomsdktest"
        const val applicationId = "1:859095255496:android:e2f84560dc371d6d7798fd"
        const val apiKey = "AIzaSyAFbdEp6gtSW7f6wKhjB4qOEYgLHbBfjzU"
    }

}