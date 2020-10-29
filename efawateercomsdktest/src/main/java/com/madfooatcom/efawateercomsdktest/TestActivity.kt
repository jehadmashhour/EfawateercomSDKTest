package com.madfooatcom.efawateercomsdktest

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.os.Build
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.activity_test.*
import org.koin.android.ext.android.inject
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import kotlin.experimental.and


internal class TestActivity : AppCompatActivity() {
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    private val remoteConfigData by inject<RemoteConfigData>()

    private val firebaseApp by inject<FirebaseApp>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        textView.text = remoteConfigData.configuration?.app?.environment?.type



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
                    this, "DocumentSnapshot added with ID: ${documentReference.id}",
                    Toast.LENGTH_SHORT
                ).show()

            }
            .addOnFailureListener { e ->
                Toast.makeText(
                    this, e.message,
                    Toast.LENGTH_SHORT
                ).show()

            }

        get(this,"SHA")

    }
        //getKeyHash("SHA")


//        try {
//            Log.wtf("ASSSSSSS", "qwr")
//            if (Build.VERSION.SDK_INT >= 28) {
//                @SuppressLint("WrongConstant") val packageInfo = packageManager.getPackageInfo(
//                    BuildConfig.LIBRARY_PACKAGE_NAME, PackageManager.GET_SIGNING_CERTIFICATES
//                )
//                val signatures: Array<Signature> = packageInfo.signingInfo.apkContentsSigners
//                val md = MessageDigest.getInstance("SHA")
//                Log.wtf("ASSSSSSS0", "asd")
//                for (signature in signatures) {
//                    md.update(signature.toByteArray())
//                    val signatureBase64 = String(Base64.encode(md.digest(), Base64.DEFAULT))
//                    Log.wtf("ASSSSSSS1", signatureBase64)
//                }
//            }
//        } catch (e: PackageManager.NameNotFoundException) {
//            e.printStackTrace()
//            e.message?.let { Log.wtf("ASSSSSSS2", it) }
//        } catch (e: NoSuchAlgorithmException) {
//            e.printStackTrace()
//            e.message?.let { Log.wtf("ASSSSSSS3", it) }
//        }



    @SuppressLint("PackageManagerGetSignatures")
    operator // test purpose
    fun get(context: Context, key: String) {
        try {
            val info: PackageInfo = context.getPackageManager()
                .getPackageInfo(
                    BuildConfig.LIBRARY_PACKAGE_NAME,
                    PackageManager.GET_SIGNATURES
                )
            for (signature in info.signatures) {
                val md = MessageDigest.getInstance(key)
                md.update(signature.toByteArray())
                val digest = md.digest()
                val toRet = StringBuilder()
                for (i in digest.indices) {
                    if (i != 0) toRet.append(":")
                    val b: Byte = digest[i] and 0xff.toByte()
                    val hex = Integer.toHexString(b.toInt())
                    if (hex.length == 1) toRet.append("0")
                    toRet.append(hex)
                }
                Log.wtf("ASSSSSSS0", String(toRet))
            }
        } catch (e1: PackageManager.NameNotFoundException) {
            Log.e("name not found", e1.toString())
        } catch (e: NoSuchAlgorithmException) {
            Log.e("no such an algorithm", e.toString())
        } catch (e: Exception) {
            Log.e("exception", e.toString())
        }
    }

//    private fun getKeyHash(hashStretagy: String) {
//        val info: PackageInfo
//        try {
//            Log.e("Dasfasf", "Dasfasf")
//            info = packageManager.getPackageInfo(
//                BuildConfig.LIBRARY_PACKAGE_NAME,
//                PackageManager.GET_SIGNATURES
//            )
//            for (signature in info.signatures) {
//                var md: MessageDigest
//                md = MessageDigest.getInstance(hashStretagy)
//                md.update(signature.toByteArray())
//                val something = String(Base64.encode(md.digest(), 0))
//                Log.e("KeyHash  -->>>>>>>>>>>>", something)
//                textView.text = something
//                // Notification.registerGCM(this);
//            }
//        } catch (e1: PackageManager.NameNotFoundException) {
//            Log.e("name not found", e1.toString())
//        } catch (e: NoSuchAlgorithmException) {
//            Log.e("no such an algorithm", e.toString())
//        } catch (e: java.lang.Exception) {
//            Log.e("exception21435", e.toString())
//        }
//    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }
}