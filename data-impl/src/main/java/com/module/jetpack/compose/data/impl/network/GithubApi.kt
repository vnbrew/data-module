package com.module.jetpack.compose.data.impl.network

import com.module.jetpack.compose.data.impl.network.model.GithubResponse
import com.module.jetpack.compose.data.impl.network.model.UserProfile
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GithubApi {
    companion object {
        const val BASE_URL = "https://api.github.com/"
    }

    @GET("search/users?q=repos:>1")
    suspend fun getUsersList(
        @Query("page") page: Int,
        @Query("per_page") pageSize: Int
    ): Response<GithubResponse>

    @GET("users/{username}")
    suspend fun getUserInfo(
        @Path("username") username: String
    ): Response<UserProfile>
}