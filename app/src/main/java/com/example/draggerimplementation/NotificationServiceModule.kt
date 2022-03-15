package com.example.draggerimplementation

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * Created by PrernaSurbhi on 15/03/22.
 *
 * @Provide - it provide the object , which is requested by consumer
 * @Named - it is the qualifier
 */
@Module
class NotificationServiceModule(){

    @Singleton
    @MessageQualifier
    @Provides
    fun getMsgService(retryCount :Int):NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}