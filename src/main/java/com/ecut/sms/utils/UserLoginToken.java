package com.ecut.sms.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Description 需要登录才能进行操作的注解UserLoginToken
 * Author: ecut
 * Date2025/6/25 17:00
 **/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLoginToken {
  boolean required() default true;
}
