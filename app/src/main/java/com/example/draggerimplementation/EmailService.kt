package com.example.draggerimplementation

import android.util.Log
import com.example.draggerimplementation.EmailService.Companion.TAG
import javax.inject.Inject

/**
 * Created by PrernaSurbhi on 15/03/22.
 */

interface NotificationService{
    fun send(to:String,from:String,body:String?)
}

class EmailService @Inject constructor():NotificationService {
   override fun send(to:String, from :String, body:String?){
        Log.d(TAG,"email send")
    }

    companion object{
        const val TAG ="EmailService"
    }
}

class MessageService  :NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d("message service","msg send")
    }
}