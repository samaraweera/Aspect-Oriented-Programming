package com.commonexception.controller;

import com.commonexception.aop.CustomerAccessAspect;
import com.commonexception.buisness.IBusiness;
import com.commonexception.exception.CustomerNotFoundException;
import com.commonexception.model.BaseResponse;
import com.commonexception.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class TestController {
    //For exception
    //Used Article : https://www.springboottutorial.com/spring-boot-exception-handling-for-rest-services
    //Advance usage :https://medium.com/@jovannypcg/understanding-springs-controlleradvice-cd96a364033f

    //For AOP
    //Best : https://www.byteslounge.com/tutorials/spring-aop-pointcut-advice-example
    //https://dzone.com/articles/implementing-aop-with-spring-boot-and-aspectj
    //https://www.springboottutorial.com/spring-boot-and-aop-with-spring-boot-starter-aop

    @Autowired
    IBusiness business;

    @PostMapping("/customerById/{id}/{name}")
    public ResponseEntity<Customer> customerById(@RequestBody  Customer baby,@PathVariable("id") Long id, @PathVariable("name") String name){

        Optional<Customer> customer = business.getCustomerById(id);
        if(!customer.isPresent()) throw new CustomerNotFoundException("id "+id);
        return new ResponseEntity(customer, HttpStatus.OK);
    }
}
