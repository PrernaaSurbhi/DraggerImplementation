package com.example.draggerimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService:UserRegistrationService

    @Inject
    lateinit var emailService:EmailService

    @Inject
    lateinit var emailService1:EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(3)

//        val userRegistrationService = component.getUserRegistrationService()
//        val emailService = component.getEmailService()

        component.inject(this)

        userRegistrationService.registerUser("prerna.surbhi@gmail.com","000")
        emailService.send("prerna","prerna1","DraggerImp basic detail")

    }

}