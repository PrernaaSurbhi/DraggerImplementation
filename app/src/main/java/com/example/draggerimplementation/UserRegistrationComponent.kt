package com.example.draggerimplementation

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

/**
 * Created by PrernaSurbhi on 15/03/22.
 *
 * @Component is the connector interface between dragger consumer and Provider .
 */
@Singleton
@Component(modules = [NotificationServiceModule::class, UserRepositoryModule::class])
interface UserRegistrationComponent {
    fun inject(mainActivity: MainActivity)

    fun getEmailService():EmailService

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance retryCount:Int):UserRegistrationComponent
    }
}


