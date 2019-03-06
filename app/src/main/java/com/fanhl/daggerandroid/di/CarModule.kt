package com.fanhl.daggerandroid.di

import com.fanhl.daggerandroid.domain.model.Car
import com.fanhl.daggerandroid.domain.model.Wheel
import dagger.Module
import dagger.Provides

@Module
internal class CarModule {
    @Provides
    fun provideCar(wheel: Wheel) = Car(wheel)
}