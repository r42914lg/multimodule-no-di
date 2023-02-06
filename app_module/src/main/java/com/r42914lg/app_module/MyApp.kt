package com.r42914lg.app_module

import com.r42914lg.feature_module.Starter

fun main() {
    MyApp().startApp()
}

class MyApp {
    fun startApp() {
        Starter(MyContractImpl()).doSomething()
    }
}