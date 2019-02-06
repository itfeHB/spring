package com.bit.sts01.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAop01Around implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("aop around before...");
		Object obj = invocation.proceed();
		System.out.println("aop around after...");
		
		return obj;
	}

}
