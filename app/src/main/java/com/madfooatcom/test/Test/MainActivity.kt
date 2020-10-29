package com.madfooatcom.test.Test

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.os.Build
import android.os.Bundle
import android.util.Base64
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.madfooatcom.efawateercomsdktest.BuildConfig
import com.madfooatcom.efawateercomsdktest.common.entrance.Efawateercom
import com.madfooatcom.test.BuildConfig.APPLICATION_ID
import com.madfooatcom.test.R
import kotlinx.android.synthetic.main.activity_main.*
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import kotlin.experimental.and


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launch.setOnClickListener {
            Efawateercom.launch()
        }


//        try {
//            Log.wtf("ASSSSSSS", "qwr")
//            if (Build.VERSION.SDK_INT >= 28) {
//                @SuppressLint("WrongConstant") val packageInfo = packageManager.getPackageInfo(
//                    com.madfooatcom.test.BuildConfig.APPLICATION_ID,
//                    PackageManager.GET_SIGNING_CERTIFICATES
//                )
//                val signatures: Array<Signature> = packageInfo.signingInfo.apkContentsSigners
//                val md = MessageDigest.getInstance("SHA")
//                Log.wtf("ASSSSSSS0", "asd")
//                for (signature in signatures) {
//                    md.update(signature.toByteArray())
//                    val signatureBase64 = String(Base64.encode(md.digest(), Base64.DEFAULT))
//                    Log.wtf("ASSSSSSS1", md.digest().toString())
//                }
//            }
//        } catch (e: PackageManager.NameNotFoundException) {
//            e.printStackTrace()
//            e.message?.let { Log.wtf("ASSSSSSS2", it) }
//        } catch (e: NoSuchAlgorithmException) {
//            e.printStackTrace()
//            e.message?.let { Log.wtf("ASSSSSSS3", it) }
//        }
//        val remoteConfig = Firebase.remoteConfig
//        val configSettings = remoteConfigSettings {
//            minimumFetchIntervalInSeconds = 1
//        }
//        remoteConfig.setConfigSettingsAsync(configSettings)
//        remoteConfig.fetchAndActivate()
//            .addOnCompleteListener(this) { task ->
//                if (task.isSuccessful) {
//                    val updated = task.result
//                    Toast.makeText(this,  remoteConfig.getString("Type"),
//                        Toast.LENGTH_SHORT).show()
//                } else {
//                    Toast.makeText(this, "Fetch failed",
//                        Toast.LENGTH_SHORT).show()
//                }
//            }
//
//        TestRemoteConfig.runRemoteConfig(this);
    }


}