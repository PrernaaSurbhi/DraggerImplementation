package com.example.draggerimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

/*
If the component is not a application level - even though class is @Singleton, new object got created for class.
 */

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService:UserRegistrationService


    lateinit var emailService:EmailService
    lateinit var emailService1:EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.factory().create(3)

         emailService = component.getEmailService()

         val component1 = DaggerUserRegistrationComponent.factory().create(3)
         emailService1 = component1.getEmailService()

        component.inject(this)

        userRegistrationService.registerUser("prerna.surbhi@gmail.com","000")
        emailService.send("prerna","prerna1","DraggerImp basic detail")

    }

}