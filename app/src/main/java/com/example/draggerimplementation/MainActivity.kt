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

    @Inject
    lateinit var emailService:EmailService


    @Inject
    lateinit var emailService1:EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as UserApplication).userRegistrationComponent


        component.inject(this)

        userRegistrationService.registerUser("prerna.surbhi@gmail.com","000")
        emailService.send("prerna","prerna1","DraggerImp basic detail")

    }

}