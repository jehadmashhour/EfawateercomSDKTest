package com.madfooatcom.efawateercomsdktest.common.base

import android.app.Activity
import android.util.Log
import android.widget.Toast
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings


class TestRemoteConfig {
    companion object {
        fun runRemoteConfig(activity: Activity) {
            val options = FirebaseOptions.Builder()
                .setProjectId("efawateercomsdktest")
                .setApplicationId("1:859095255496:android:e2f84560dc371d6d7798fd")
                .setApiKey("AIzaSyAFbdEp6gtSW7f6wKhjB4qOEYgLHbBfjzU")
                .build()


            val firebaseApp: FirebaseApp =
                FirebaseApp.initializeApp(activity /* Context */, options, "EfawateercomSDKTest")
            val remoteConfig = Firebase.remoteConfig(firebaseApp)
            val configSettings = remoteConfigSettings {
                minimumFetchIntervalInSeconds = 1
            }
            remoteConfig.setConfigSettingsAsync(configSettings)
            remoteConfig.fetchAndActivate()
                .addOnCompleteListener(activity) { task ->
                    if (task.isSuccessful) {
                        val updated = task.result
                        Toast.makeText(
                            activity, remoteConfig.getString("Type"),
                            Toast.LENGTH_SHORT
                        ).show()
                    } else {
                        Toast.makeText(
                            activity, "Fetch failed",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

            val firestore = Firebase.firestore(firebaseApp)

            val user = hashMapOf(
                "first" to "Ada",
                "last" to "Lovelace",
                "born" to 1815
            )

            firestore.collection("users")
                .add(user)
                .addOnSuccessListener { documentReference ->
                    Toast.makeText(
                        activity, "DocumentSnapshot added with ID: ${documentReference.id}",
                        Toast.LENGTH_SHORT
                    ).show()

                }
                .addOnFailureListener { e ->
                    Toast.makeText(
                        activity, e.message,
                        Toast.LENGTH_SHORT
                    ).show()

                }

        }
    }
}