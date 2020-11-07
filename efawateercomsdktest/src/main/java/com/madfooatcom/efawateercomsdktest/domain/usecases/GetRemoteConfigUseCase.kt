package com.madfooatcom.efawateercomsdktest.domain.usecases

import com.madfooatcom.efawateercomsdktest.common.constant.FirebaseConstants
import com.madfooatcom.efawateercomsdktest.data.entities.RemoteConfigData
import com.madfooatcom.efawateercomsdktest.domain.repository.RemoteConfigRepository
import com.madfooatcom.efawateercomsdktest.domain.usecases.base.UseCase
import io.reactivex.Single

internal class GetRemoteConfigUseCase(private val remoteConfigRepository: RemoteConfigRepository) :
    UseCase<RemoteConfigData>() {
    override fun createSingle(data: Map<String, Any>?): Single<RemoteConfigData> =
        remoteConfigRepository.getRemoteConfigData(data!![FirebaseConstants.REMOTE_CONFIG_CACHE_EXPIRATION_KEY] as Long)

    fun getRemoteConfigData(minimumFetchIntervalInSeconds: Long = FirebaseConstants.REMOTE_CONFIG_CACHE_EXPIRATION_VALUE): Single<RemoteConfigData> {
        val data = HashMap<String, Any>()
        data[FirebaseConstants.REMOTE_CONFIG_CACHE_EXPIRATION_KEY] = minimumFetchIntervalInSeconds
        return single(data)
    }

}