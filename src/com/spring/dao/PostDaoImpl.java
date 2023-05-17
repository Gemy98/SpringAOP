package com.spring.dao;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostDaoImpl implements PostDao{

	@Override
	public void allPosts(User user) {

		System.out.println("My Posts....PostDao");
	}

	@Override
	public String allLikes(User user,int result) {
		return "PostDao....likes";
	}

}
