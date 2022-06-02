package com.module.jetpack.compose.data.impl.network

import javax.inject.Inject
import okhttp3.Interceptor
import okhttp3.Response

class GithubRequestFieldsSetter @Inject constructor() : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        val request = originalRequest.newBuilder()
            .build()

        return chain.proceed(request)
    }
}