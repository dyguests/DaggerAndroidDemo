package com.fanhl.daggerandroid.di

import com.fanhl.daggerandroid.MainActivity
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}

@Module
internal class AppModule {
    @Provides
    fun provideCar(wheel: Wheel) = Car(wheel)
}

class Car(val wheel: Wheel)

class Wheel @Inject constructor() {
    fun type() = "宝马的轮胎"
}