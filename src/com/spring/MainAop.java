package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.mypack.Person;

public class MainAop {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext an 
		= new AnnotationConfigApplicationContext(SpringContainer.class);
		
		Person p = an.getBean("myPerson",Person.class);
		p.getData();
	
	}

}
