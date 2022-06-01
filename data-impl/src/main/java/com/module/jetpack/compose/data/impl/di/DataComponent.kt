package com.module.jetpack.compose.data.impl.di

import com.module.jetpack.compose.common.di.CommonProvider
import com.module.jetpack.compose.data.api.DataProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    dependencies = [CommonProvider::class],
    modules = [DataModule::class]
)
interface DataComponent : DataProvider