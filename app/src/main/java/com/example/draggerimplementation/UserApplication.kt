package com.example.draggerimplementation

import android.app.Application

/**
 * Created by PrernaSurbhi on 16/03/22.
 */
class UserApplication: Application() {
    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
//        userRegistrationComponent =
        userRegistrationComponent = DaggerUserRegistrationComponent.factory().create(3)
    }
}