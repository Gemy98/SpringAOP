package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostServiceImpl implements PostService{

	private String name ; 
	@Override
	public String allPosts(User user,int result) {

		return "My Posts....PostService" ; 
	}

	@Override
	public String allLikes(User user) {
		return "PostService....Likes";
	}

	@Override
	public void startService() {
			System.out.println("Start Service...");
	}

	@Override
	public void setName() {
				System.out.println("this is set name");		
	}

	@Override
	public String getName() {
		System.out.println("this is set name");		
		return null;
	}

}
