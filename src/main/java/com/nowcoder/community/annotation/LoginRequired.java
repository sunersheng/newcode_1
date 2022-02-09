package com.nowcoder.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //表示这个注解可以写在方法上 用来描述方法
@Retention(RetentionPolicy.RUNTIME) //声明注解的有效时长
public @interface LoginRequired {



}
