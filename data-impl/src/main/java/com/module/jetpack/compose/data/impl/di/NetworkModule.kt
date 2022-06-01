package com.module.jetpack.compose.data.impl.di

import com.module.jetpack.compose.data.impl.network.GithubApi
import com.module.jetpack.compose.data.impl.network.GithubRequestFieldsSetter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import javax.inject.Singleton
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

@Module
object NetworkModule {

    @Provides
    @Singleton
    fun provideMoshi(): Moshi =
        Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()

    @Provides
    @Singleton
    fun provideHttpClient(requestFieldsSetter: GithubRequestFieldsSetter): OkHttpClient =
        OkHttpClient.Builder()
            .addNetworkInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .addInterceptor(requestFieldsSetter)
            .build()

    @Provides
    @Singleton
    fun provideGithubApi(client: OkHttpClient, moshi: Moshi): GithubApi =
        Retrofit.Builder()
            .baseUrl(GithubApi.BASE_URL)
            .client(client)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create()
}