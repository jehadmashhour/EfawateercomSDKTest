package com.madfooatcom.efawateercomsdktest.presentation.common

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.madfooatcom.efawateercomsdktest.TestActivity

fun navigateToTestActivity(context: Context, bundle: Bundle? = null) {
    val intent = Intent(context, TestActivity::class.java)
    bundle?.let { intent.putExtras(it) }
    context.startActivity(intent)
}