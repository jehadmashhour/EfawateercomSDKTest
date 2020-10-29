package com.madfooatcom.efawateercomsdktest.common.provider

import android.app.Activity
import android.app.Application
import android.content.ContentProvider
import android.content.ContentValues
import android.content.Context
import android.content.pm.ProviderInfo
import android.database.Cursor
import android.net.Uri
import android.os.Bundle

import androidx.annotation.VisibleForTesting
import com.google.android.gms.common.internal.Preconditions


class ActivityContextProvider : ContentProvider() {

    companion object {
        lateinit var activityContext: Context

        @VisibleForTesting
        val EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY =
            "com.madfooatcom.efawateercomsdktest.common.provider.ActivityContextProvider"

        /**
         * Check that the content provider's authority does not use efawateercom-common's package name. If it
         * does, crash in order to alert the developer of the problem before they distribute the app.
         */
        private fun checkContentProviderAuthority(info: ProviderInfo) {
            Preconditions.checkNotNull(
                info,
                "ActivityContextProvider ProviderInfo cannot be null."
            )
            check(EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY != info.authority) {
                ("Incorrect provider authority in manifest. Most likely due to a missing "
                        + "applicationId variable in application's build.gradle.")
            }
        }
    }


    override fun onCreate(): Boolean {
        registerApplicationActivityLifecycleCallbacks((context!! as Application))
        return false
    }

    private fun registerApplicationActivityLifecycleCallbacks(application: Application) {
        application.registerActivityLifecycleCallbacks(object :
            Application.ActivityLifecycleCallbacks {
            override fun onActivityCreated(p0: Activity, p1: Bundle?) {
                activityContext = p0
            }

            override fun onActivityStarted(p0: Activity) {
                activityContext = p0
            }

            override fun onActivityResumed(p0: Activity) {
                activityContext = p0
            }

            override fun onActivityPaused(p0: Activity) {

            }

            override fun onActivityStopped(p0: Activity) {

            }

            override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {

            }

            override fun onActivityDestroyed(p0: Activity) {

            }

        })
    }

    override fun attachInfo(context: Context?, info: ProviderInfo?) {
        checkContentProviderAuthority(info!!)
        super.attachInfo(context, info)

    }


    override fun query(
        p0: Uri,
        p1: Array<out String>?,
        p2: String?,
        p3: Array<out String>?,
        p4: String?
    ): Cursor? {
        return null
    }

    override fun getType(p0: Uri): String? {
        return null
    }

    override fun insert(p0: Uri, p1: ContentValues?): Uri? {
        return null
    }

    override fun delete(p0: Uri, p1: String?, p2: Array<out String>?): Int {
        return 0
    }

    override fun update(p0: Uri, p1: ContentValues?, p2: String?, p3: Array<out String>?): Int {
        return 0
    }
}