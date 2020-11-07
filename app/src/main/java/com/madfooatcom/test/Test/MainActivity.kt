package com.madfooatcom.test.Test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.madfooatcom.efawateercomsdktest.common.config.gateway.EfPaymentWay
import com.madfooatcom.efawateercomsdktest.common.config.gateway.Efawateercom
import com.madfooatcom.efawateercomsdktest.common.config.gateway.PaymentConfiguration
import com.madfooatcom.efawateercomsdktest.common.config.gateway.EfUserInfo
import com.madfooatcom.test.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ///Get Token with amount and currency by rest api
        launch.setOnClickListener {
            Efawateercom.launch(
                PaymentConfiguration.Builder(
                    "3534523523",
                    EfUserInfo.Builder("ashf", "auisf")
                        .userName("asgf")
                        .userPhone("oiqwe")
                        .userEmail("qr")
                        .build()
                )
                    .paymentWay(EfPaymentWay.CONTINUOUS)
                    .correlationId("352435")
                    .build()
            )
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