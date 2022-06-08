package ru.minko.mobile

import me.vponomarenko.injectionmanager.IHasComponent
import me.vponomarenko.injectionmanager.x.XInjectionManager
import ru.touchin.roboswag.navigation_base.TouchinApp
import ru.minko.mobile.di.ApplicationComponent
import ru.minko.mobile.di.DaggerApplicationComponent

class App : TouchinApp(), IHasComponent<ApplicationComponent> {

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    fun initDagger() {
        XInjectionManager.init(this)
        XInjectionManager.bindComponent(this)
    }

    override fun getComponent(): ApplicationComponent = DaggerApplicationComponent
            .factory()
            .create(this)

}
