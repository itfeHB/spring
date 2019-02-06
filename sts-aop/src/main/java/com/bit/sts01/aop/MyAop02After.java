package com.bit.sts01.aop;

import org.aspectj.lang.JoinPoint;

public class MyAop02After {

	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");

	}
}
