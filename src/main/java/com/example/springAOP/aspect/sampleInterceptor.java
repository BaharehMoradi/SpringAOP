package com.example.springAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class sampleInterceptor {

    @Before("execution(* com.example.springAOP.*.*.f*(..))")
    public void beforeMethodExecution1(JoinPoint joinPoint) {
        System.out.println("Intercepted method with policy 1: " + joinPoint.getSignature().toShortString());
    }

    @Before("execution(* com.example.springAOP.*.*.s*(..))")
    public void beforeMethodExecution2(JoinPoint joinPoint) {
        System.out.println("Intercepted method with policy 2: " + joinPoint.getSignature().toShortString());
    }

    @Before("execution(* com.example.springAOP.*.*.a*1(..))")
    public void beforeMethodExecution3(JoinPoint joinPoint) {
        System.out.println("Intercepted method with policy 3: " + joinPoint.getSignature().toShortString());
    }
    @Before("execution(* com.example.springAOP.*.*.a*2(..))")
    public void beforeMethodExecution4(JoinPoint joinPoint) {
        System.out.println("Intercepted method with policy 4: " + joinPoint.getSignature().toShortString());
    }
}
