package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class PostServiceImpl implements PostService{

	@Override
	public void allPosts() {
		System.out.println("My Posts....PostService");

	}

}
