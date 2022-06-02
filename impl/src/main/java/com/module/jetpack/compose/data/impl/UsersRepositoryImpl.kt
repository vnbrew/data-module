package com.module.jetpack.compose.data.impl

import com.module.jetpack.compose.common.domain.User
import com.module.jetpack.compose.common.domain.UsersRepository
import com.module.jetpack.compose.data.impl.network.GithubApi
import com.module.jetpack.compose.data.impl.mapping.DataMapper
import com.module.jetpack.compose.data.impl.storage.AppDatabase
import javax.inject.Inject

class UsersRepositoryImpl @Inject constructor(
    private val githubApi: GithubApi,
    private val appDatabase: AppDatabase,
    private val mapper: DataMapper
) : UsersRepository {

    private var currentUser: User? = null

    override suspend fun getCurrentUser(): User? {
        return null
    }

    private suspend fun prefetchData() {
    }
}