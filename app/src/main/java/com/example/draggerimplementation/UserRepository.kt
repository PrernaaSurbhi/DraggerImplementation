package com.example.draggerimplementation

import android.util.Log
import javax.inject.Inject

/**
 * Created by PrernaSurbhi on 15/03/22.
 */
interface UserRepository{
    fun saveUser(email:String,password:String)
}

class SqlRepository @Inject constructor() :UserRepository{
  override  fun saveUser(email:String,password:String){
        Log.d(TAG,"user saved in data base")
    }

    companion object{
        const val TAG ="SqlRepository"
    }
}

class FireBaseRepository :UserRepository{
    override  fun saveUser(email:String,password:String){
        Log.d(TAG,"fire base repositories")
    }

    companion object{
        const val TAG ="FireBaseRepository"
    }
}
