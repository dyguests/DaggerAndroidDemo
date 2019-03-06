package com.fanhl.daggerandroid.di

import com.fanhl.daggerandroid.MainActivity
import com.fanhl.daggerandroid.domain.model.Car
import com.fanhl.daggerandroid.domain.model.Wheel
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Subcomponent(
    modules = [
        CarModule::class
    ]
)
interface MainActivityComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}

@Module
internal class CarModule {
    @Provides
    fun provideCar(wheel: Wheel) = Car(wheel)
}

@Module(
    subcomponents = [
        MainActivityComponent::class
    ]
)
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindYourActivityInjectorFactory(builder: MainActivityComponent.Builder): AndroidInjector.Factory<*>
}

@Component(
    modules = [
        MainActivityModule::class
    ]
)
interface AppComponent