package com.commonexception.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutDefinition {

    @Pointcut("within(com.commonexception.controller..*)")
    public void controllerLayer(){}
}
