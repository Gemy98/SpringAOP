package com.spring.mypack;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {
	
	public void getData() {
	System.out.println("iam person");	
		
	}
}
