package com.module.jetpack.compose.data.api

import androidx.compose.runtime.compositionLocalOf
import com.module.jetpack.compose.common.domain.UsersRepository

interface DataProvider {
    val usersRepository: UsersRepository
}

val LocalDataProvider = compositionLocalOf<DataProvider> { error("No data provider found!") }