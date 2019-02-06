package com.bit.sts01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAop02Before {

	@Before("execution(* com.bit.sts01.model.JavaDao.func02(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("injacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
}
