package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.configuration.SpringContainer;
import com.spring.dao.PostDao;
import com.spring.dao.PostDaoImpl;
import com.spring.dao.Student;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext an = new AnnotationConfigApplicationContext(SpringContainer.class);
		
		Student st = an.getBean("student",Student.class);
		st.myData();
		
		PostDao pd = an.getBean("postDaoImpl",PostDao.class);
		pd.allPosts();
	}

}
