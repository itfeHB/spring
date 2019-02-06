package com.bit.sts01.aop;

import org.aspectj.lang.JoinPoint;

public class MyAop02Before {

	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("injacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
}
