package com.example.draggerimplementation

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

/**
 * Created by PrernaSurbhi on 15/03/22.
 * if we want our annotation class to be qualifer , we have to add @Qualifier
 * @Documented - in order to check , whether it is in java doc or not
 * @Retention - it define the annotation timeline
 * @Retention - it is of three type , (i)RetentionPolicy.RUNTIME - it will be valid whole run time.
 * (ii)RetentionPolicy.CLASS- It will be valid till the class life time
 * (iii)RetentionPolicy.SOURCE - it will be valid till compile time.
 *
 */

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class MessageQualifier()
