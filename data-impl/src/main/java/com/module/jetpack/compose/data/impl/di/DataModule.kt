package com.module.jetpack.compose.data.impl.di

import com.module.jetpack.compose.common.domain.UsersRepository
import com.module.jetpack.compose.data.impl.UsersRepositoryImpl
import com.module.jetpack.compose.data.impl.mapping.DataMapper
import com.module.jetpack.compose.data.impl.mapping.DataMapperImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [NetworkModule::class, StorageModule::class])
interface DataModule {

    @Binds
    @Singleton
    fun mapper(impl: DataMapperImpl): DataMapper

    @Binds
    @Singleton
    fun usersRepository(impl: UsersRepositoryImpl): UsersRepository
}