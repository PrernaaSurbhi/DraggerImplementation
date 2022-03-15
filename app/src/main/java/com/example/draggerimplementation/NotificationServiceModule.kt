package com.example.draggerimplementation

import dagger.Module
import dagger.Provides
import javax.inject.Named

/**
 * Created by PrernaSurbhi on 15/03/22.
 *
 * @Provide - it provide the object , which is requested by consumer
 * @Named - it is the qualifier
 */
@Module
class NotificationServiceModule {

    @MessageQualifier
    @Provides
    fun getMsgService():NotificationService{
        return MessageService()
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return emailService
    }
}