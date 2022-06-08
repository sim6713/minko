package ru.minko.mobile.di

import dagger.Binds
import dagger.Module
import ru.touchin.template.feature_login.navigation.LoginCoordinator
import ru.minko.mobile.navigation.login.LoginCoordinatorImpl

@Module
abstract class CoordinatorsImpl {

    @Binds
    abstract fun loginCoordinator(impl: LoginCoordinatorImpl): LoginCoordinator
}
