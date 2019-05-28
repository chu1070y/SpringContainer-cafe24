package com.cafe24.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cafe24.springcontainer.user.User;

import config.user.UserConifg01;

public class JavaConfigTest01 {
	
	public static void main(String[] args) {
		testUser01();
		testuser02();
	}

	public static void testUser01() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(UserConifg01.class);
		
		User user = appCtx.getBean(User.class);
		System.out.println(user);
		
		(((ConfigurableApplicationContext) appCtx)).close();
	}
	
	public static void testuser02() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext("config.user");
		
		User user = appCtx.getBean(User.class);
		System.out.println(user);
		
		(((ConfigurableApplicationContext) appCtx)).close();
	}
}
