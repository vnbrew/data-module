package com.module.jetpack.compose.data.impl.di

import android.content.Context
import dagger.Module
import dagger.Provides
import com.module.jetpack.compose.data.impl.storage.AppDatabase
import javax.inject.Singleton

@Module
object StorageModule {

    @Provides
    @Singleton
    fun provideDatabase(context: Context): AppDatabase =
        AppDatabase.getInstance(context)
}


