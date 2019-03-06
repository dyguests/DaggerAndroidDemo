package com.fanhl.daggerandroid.di

import com.fanhl.daggerandroid.App
import com.fanhl.daggerandroid.MainActivity
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Subcomponent
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Subcomponent(
    modules = [
        CarModule::class
    ]
)
interface MainActivitySubComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}

@Module(
    subcomponents = [
        MainActivitySubComponent::class
    ]
)
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder: MainActivitySubComponent.Builder): AndroidInjector.Factory<*>
}

@Component(
    modules = [
        MainActivityModule::class
    ]
)
interface AppComponent {
//    fun inject(app: App)
}