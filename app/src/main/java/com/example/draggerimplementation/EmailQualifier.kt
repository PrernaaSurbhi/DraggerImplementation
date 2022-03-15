package com.example.draggerimplementation

import java.lang.annotation.Documented
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Retention
import javax.inject.Qualifier

/**
 * Created by PrernaSurbhi on 15/03/22.
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class EmailQualifier()



