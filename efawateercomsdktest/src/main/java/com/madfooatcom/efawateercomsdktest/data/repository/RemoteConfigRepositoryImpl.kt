package com.madfooatcom.efawateercomsdktest.data.repository


import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import com.madfooatcom.efawateercomsdktest.data.source.remote.source.FirebaseRemoteConfigDataSourceImpl
import com.madfooatcom.efawateercomsdktest.domain.repository.RemoteConfigRepository
import io.reactivex.Single


internal class RemoteConfigRepositoryImpl(private val firebaseRemoteConfigDataSourceImpl: FirebaseRemoteConfigDataSourceImpl) :
    RemoteConfigRepository {
    override fun getRemoteConfigData(minimumFetchIntervalInSeconds: Long): Single<RemoteConfigData> =
        Single.create { emitter ->
            firebaseRemoteConfigDataSourceImpl.apply {
                fetch(minimumFetchIntervalInSeconds)
                    .addOnSuccessListener {
                        activate().addOnSuccessListener {
                            emitter.onSuccess(getRemoteConfigData())
                        }.addOnFailureListener { emitter.onError(it) }
                    }
                    .addOnFailureListener { emitter.onError(it) }
            }
        }
}