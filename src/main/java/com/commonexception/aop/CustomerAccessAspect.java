package com.commonexception.aop;

import com.commonexception.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class CustomerAccessAspect {

    @Before(value ="com.commonexception.aop.PointcutDefinition.controllerLayer() && args(baby,id,name)")
    public void before(JoinPoint joinPoint,Customer baby,Long id, String name ){

        log.info("====================>  Check 4 Updates {}",baby.getAddress());
        log.info("====================>  Check 4 Updates {}",id);
        log.info("====================>  Check 4 Updates {}",name);
        log.info("################################# {}>  ");
        log.info("====================> Allowed execution for {}", joinPoint.getArgs());;
        log.info("====================> Allowed execution for {}", joinPoint.getSignature());
        log.info("====================> Allowed execution for {}", joinPoint.getKind());
        log.info("====================> Allowed execution for {}", joinPoint.getSourceLocation());
        log.info("====================> Allowed execution for {}", joinPoint.getStaticPart());
        log.info("====================> Allowed execution for {}", joinPoint.getTarget());
        log.info("====================> Allowed execution for {}", joinPoint.getThis());
        log.info("====================> Allowed execution for {}", joinPoint.toString());

    }


}
