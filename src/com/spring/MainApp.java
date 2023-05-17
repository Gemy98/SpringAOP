package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.aop.PostService;
import com.spring.configuration.SpringContainer;
import com.spring.dao.PostDao;
import com.spring.dao.PostDaoImpl;
import com.spring.dao.Student;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(SpringContainer.class);
		 
		
		PostDao pd = an.getBean("postDaoImpl",PostDao.class);
		pd.allPosts();
		System.out.println(pd.allLikes());
		
		
		System.out.println("///////////");
		
		PostService ps = an.getBean("postServiceImpl",PostService.class);
		System.out.println(ps.allPosts());
		System.out.println(ps.allLikes());

	}

}
