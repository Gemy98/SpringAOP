package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.mypack.Person;
import com.spring.mypack.AccessDataBase;

public class MainAop {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext an 
		= new AnnotationConfigApplicationContext(SpringContainer.class);
		
		AccessDataBase p = an.getBean("accessDataBase",AccessDataBase.class);
		p.getStudent();
	}

}
