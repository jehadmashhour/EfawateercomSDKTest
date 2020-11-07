package com.madfooatcom.efawateercomsdktest.common.config.gateway

import android.content.Context
import android.widget.Toast
import com.madfooatcom.efawateercomsdktest.common.di.module.loadEfawateercomPaymentModule
import com.madfooatcom.efawateercomsdktest.common.di.module.loadRemoteConfigDataModule
import com.madfooatcom.efawateercomsdktest.common.provider.ActivityContextProvider
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import com.madfooatcom.efawateercomsdktest.domain.usecases.GetRemoteConfigUseCase
import com.madfooatcom.efawateercomsdktest.presentation.common.navigateToTestActivity
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


@OptIn(KoinApiExtension::class)
internal class EfawateercomCreator(private val getRemoteConfigUseCase: GetRemoteConfigUseCase) :
    KoinComponent, EfawateercomCallbacks {

    private val context by lazy {
        ActivityContextProvider.activityContext ?: inject<Context>().value
    }

    override fun init() = getRemoteConfig(false)


    override fun launch(paymentConfiguration: PaymentConfiguration) =
        loadEfawateercomPaymentModule(paymentConfiguration).also {
            getRemoteConfig(true)
        }

    override fun confirmPayment() {
        TODO("Not yet implemented")
    }

    override fun manageWallet() {
        TODO("Not yet implemented")
    }


    private fun getRemoteConfig(canLaunch: Boolean) {
        getRemoteConfigUseCase.getRemoteConfigData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<RemoteConfigData> {
                override fun onSubscribe(d: Disposable) {
                }

                override fun onSuccess(remoteConfigData: RemoteConfigData) {
                    loadRemoteConfigDataModule(remoteConfigData)
                    if (canLaunch) {
                        navigateToTestActivity(context)
                    }


                }

                override fun onError(throwable: Throwable) {
                    Toast.makeText(context, throwable.message, Toast.LENGTH_SHORT).show()
                }
            })
    }
}