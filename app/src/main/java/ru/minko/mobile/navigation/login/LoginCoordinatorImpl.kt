package ru.minko.mobile.navigation.login

import ru.terrakok.cicerone.Router
import ru.touchin.template.feature_login.navigation.LoginCoordinator
import ru.minko.mobile.navigation.MainNavigation
import javax.inject.Inject

class LoginCoordinatorImpl @Inject constructor(
        @MainNavigation private val router: Router
) : LoginCoordinator {

    override fun openMainScreen() {
        router.exit()
    }

}
