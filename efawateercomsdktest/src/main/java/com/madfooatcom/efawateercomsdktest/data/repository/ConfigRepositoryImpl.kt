package com.madfooatcom.efawateercomsdktest.data.repository


import com.madfooatcom.efawateercomsdktest.common.constants.FirebaseConstants
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import com.madfooatcom.efawateercomsdktest.data.source.remote.source.RemoteConfigDataSourceImpl
import com.madfooatcom.efawateercomsdktest.domain.repository.ConfigRepository
import io.reactivex.rxjava3.core.Maybe

class ConfigRepositoryImpl(
//    private val localConfigDataSourceImpl: LocalConfigDataSourceImpl,
    private val remoteConfigDataSourceImpl: RemoteConfigDataSourceImpl
) :
    ConfigRepository {
    override fun getRemoteConfigData(/*isFromCache: Boolean*/): Maybe<RemoteConfigData> =
        Maybe.create { emitter ->
            remoteConfigDataSourceImpl.apply {
                fetch(FirebaseConstants.FIREBASE_CACHE_EXPIRATION)
                    .addOnCompleteListener { emitter.onComplete() }
                    .addOnSuccessListener {
                        activate()
                        emitter.onSuccess(getRemoteConfigData())
                    }
                    .addOnFailureListener { emitter.onError(it) }
            }
        }
}