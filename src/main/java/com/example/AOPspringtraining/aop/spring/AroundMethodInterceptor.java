package com.example.AOPspringtraining.aop.spring;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundMethodInterceptor implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object [] args = invocation.getArguments();
		String signature = invocation.getMethod().toString();
		
		Object result = invocation.proceed();
		System.out.println("method "+signature+" was called with next args "+Arrays.toString(args));
		return result;
	}

}
