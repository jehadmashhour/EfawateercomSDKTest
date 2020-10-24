package com.madfooatcom.test.Test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.madfooatcom.efawateercomsdktest.common.config.paymentgateway.EfawateercomPaymentGateway

import com.madfooatcom.test.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launch.setOnClickListener {
            EfawateercomPaymentGateway.launch(this)
        }


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