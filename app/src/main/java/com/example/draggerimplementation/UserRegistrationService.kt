package com.example.draggerimplementation

import javax.inject.Inject
import javax.inject.Named

/**
 * Created by PrernaSurbhi on 15/03/22.
 *
 * @Named - its a named annotation , which is also known as Named Annotation qualifier.
 * drawback of this qualifier is that , is may face typo error.
 * In order to avoid that we have to make own annotation Qualifier class.
 */
class UserRegistrationService @Inject constructor(
    private val userRepository:UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {
    fun registerUser(email:String,password: String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"no-reply","Userregistration")
    }

    companion object{
        const val TAG = "UserRegistrationService"
    }
}