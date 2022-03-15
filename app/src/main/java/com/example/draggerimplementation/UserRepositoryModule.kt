package com.example.draggerimplementation

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by PrernaSurbhi on 15/03/22.
 *
 * @Provide - it provide the object , which is requested by consumer
 */
@Module
abstract class UserRepositoryModule {

    @Binds
    @Singleton
   abstract fun getSQLRepository(sqlRepository: SqlRepository):UserRepository


}