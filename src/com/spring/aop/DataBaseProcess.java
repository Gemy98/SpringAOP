package com.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataBaseProcess {
	
	@Before("execution(public * getStudent())")
	public void beginTra() {
		System.out.println("Start Tra .....");
		
	}
	@After("execution(public * getStudent())")
	public void commitTra() {
		System.out.println("commit Tra .....");
		
	}
	
}
