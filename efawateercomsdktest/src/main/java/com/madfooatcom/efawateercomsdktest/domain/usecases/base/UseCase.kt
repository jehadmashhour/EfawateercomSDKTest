package com.madfooatcom.efawateercomsdktest.domain.usecases.base

import io.reactivex.Single

internal abstract class UseCase<T>() {

    abstract fun createSingle(data: Map<String, Any>? = null): Single<T>

    fun single(withData: Map<String, Any>? = null): Single<T> {
        return createSingle(withData)
    }

}