package com.example.draggerimplementation

import android.util.Log
import com.example.draggerimplementation.EmailService.Companion.TAG
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by PrernaSurbhi on 15/03/22.
 */

interface NotificationService{
    fun send(to:String,from:String,body:String?)
}

@Singleton
class EmailService @Inject constructor():NotificationService {
   override fun send(to:String, from :String, body:String?){
        Log.d(TAG,"email send")
    }

    companion object{
        const val TAG ="EmailService"
    }
}

class MessageService(private val retryCount:Int)  :NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d("message service","retry count $retryCount")
    }
}