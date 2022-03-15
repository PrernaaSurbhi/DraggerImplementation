package com.example.draggerimplementation

import android.util.Log
import javax.inject.Inject

/**
 * Created by PrernaSurbhi on 15/03/22.
 */
class EmailService @Inject constructor() {
    fun send(to:String, from :String, body:String?){
        Log.d(TAG,"email send")
    }

    companion object{
        const val TAG ="EmailService"
    }
}