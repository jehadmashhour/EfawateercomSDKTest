package com.madfooatcom.efawateercomsdktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.madfooatcom.efawateercomsdktest.common.di.modules.makeRemoteConfigDataModule
import com.madfooatcom.efawateercomsdktest.domain.usecases.GetRemoteConfigUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_test.*
import org.koin.android.ext.android.inject
import org.koin.core.context.loadKoinModules

class TestActivity : AppCompatActivity() {
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    private val getRemoteConfigUseCase by inject<GetRemoteConfigUseCase>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val disposable = getRemoteConfigUseCase.getRemoteConfigData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    loadKoinModules(makeRemoteConfigDataModule(it))
                    textView.text = it.toString()
                },
                { Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show() })

        compositeDisposable.add(disposable)

    }

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.dispose()
    }
}