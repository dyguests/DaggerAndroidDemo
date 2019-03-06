package com.fanhl.daggerandroid.di

import com.fanhl.daggerandroid.MainActivity
import com.fanhl.daggerandroid.domain.model.Car
import com.fanhl.daggerandroid.domain.model.Wheel
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(
    modules = [
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}

@Module
internal class AppModule {
    @Provides
    fun provideCar(wheel: Wheel) = Car(wheel)
}

