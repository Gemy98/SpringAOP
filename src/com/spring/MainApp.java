package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.PostDao;
import com.spring.dao.PostDaoImpl;
import com.spring.dao.PostService;
import com.spring.dao.Student;
import com.spring.model.User;


public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(SpringContainer.class);
		 User u = new User();
		 int re = 0 ; 
		PostDao pd = an.getBean("postDaoImpl",PostDao.class);
		pd.allPosts(u);
		System.out.println(pd.allLikes(u,re));
		pd.funDao();
		
		System.out.println("///////////");
		
		PostService ps = an.getBean("postServiceImpl",PostService.class);
		System.out.println(ps.allPosts(u,re));
		System.out.println(ps.allLikes(u));
		ps.startService();

	}

}
