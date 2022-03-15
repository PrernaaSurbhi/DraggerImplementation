package com.example.draggerimplementation

import android.util.Log
import javax.inject.Inject

/**
 * Created by PrernaSurbhi on 15/03/22.
 */
class UserRepository @Inject constructor() {
    fun saveUser(email:String,password:String){
        Log.d(TAG,"user saved in data base")
    }

    companion object{
        const val TAG ="UserRepository"
    }
}