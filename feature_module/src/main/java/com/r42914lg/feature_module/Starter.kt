package com.r42914lg.feature_module

class Starter(private val myContract: MyContract) {
    fun doSomething() {
        myContract.f1()
    }
}