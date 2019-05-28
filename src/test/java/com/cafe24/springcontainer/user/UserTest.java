package com.cafe24.springcontainer.user;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConifg01;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = UserConifg01.class) // 이건 클래스를 직접 접근하는 것
//@ContextConfiguration(locations={}) // 이거는 xml 위치를 알려주는 것
public class UserTest {
	@Autowired
	private User user;
	
	@Test
	public void testUser() {
		assertNotNull(user);
	}
}
