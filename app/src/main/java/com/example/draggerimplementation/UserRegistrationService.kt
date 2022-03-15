package com.example.draggerimplementation

import javax.inject.Inject

/**
 * Created by PrernaSurbhi on 15/03/22.
 */
class UserRegistrationService @Inject constructor(
    private val userRepository:UserRepository,
    private val emailService:EmailService
) {
    fun registerUser(email:String,password: String){
        userRepository.saveUser(email,password)
        emailService.send(email,"no-reply","Userregistration")
    }



    companion object{
        const val TAG = "UserRegistrationService"
    }
}