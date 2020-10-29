package com.madfooatcom.efawateercomsdktest.common.entrance

import android.content.Intent
import android.widget.Toast
import com.madfooatcom.efawateercomsdktest.TestActivity
import com.madfooatcom.efawateercomsdktest.common.di.modules.makeRemoteConfigDataModule
import com.madfooatcom.efawateercomsdktest.common.provider.ActivityContextProvider
import com.madfooatcom.efawateercomsdktest.domain.usecases.GetRemoteConfigUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent

import org.koin.core.context.loadKoinModules


@OptIn(KoinApiExtension::class)
internal class Launcher(private val getRemoteConfigUseCase: GetRemoteConfigUseCase) : KoinComponent {
    private val compositeDisposable: CompositeDisposable = CompositeDisposable()
    private val context by lazy {
        ActivityContextProvider.activityContext
    }

    internal fun launch() = getRemoteConfig()

    private fun getRemoteConfig() {
        compositeDisposable.add(
            getRemoteConfigUseCase.getRemoteConfigData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        loadKoinModules(makeRemoteConfigDataModule(it))
                        goToTestActivity()
                        compositeDisposable.dispose()
                    },
                    {
                        Toast.makeText(context, it.message, Toast.LENGTH_SHORT).show()
                        compositeDisposable.dispose()
                    })
        )
    }

    private fun goToTestActivity() {
        context.startActivity(Intent(context, TestActivity::class.java))
    }
}
