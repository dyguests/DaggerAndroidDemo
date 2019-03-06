package com.fanhl.daggerandroid.di

import com.fanhl.daggerandroid.App
import com.fanhl.daggerandroid.ui.main.di.MainActivityModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(
    modules = [
        AndroidInjectionModule::class,
        MainActivityModule::class
    ]
)
interface AppComponent : AndroidInjector<App>