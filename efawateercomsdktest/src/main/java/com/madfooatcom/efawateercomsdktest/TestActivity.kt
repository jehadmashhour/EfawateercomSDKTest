package com.madfooatcom.efawateercomsdktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.madfooatcom.efawateercomsdktest.common.di.modules.makeRemoteConfigDataModule
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import com.madfooatcom.efawateercomsdktest.domain.usecases.GetRemoteConfigUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_test.*
import org.koin.android.ext.android.inject
import org.koin.core.context.loadKoinModules

internal class TestActivity : AppCompatActivity() {
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    private val remoteConfigData by inject<RemoteConfigData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        textView.text = remoteConfigData.configuration?.app?.environment?.type

    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }
}