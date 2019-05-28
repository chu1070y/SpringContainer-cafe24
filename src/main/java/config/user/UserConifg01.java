package config.user;

import org.springframework.context.annotation.Bean;

import com.cafe24.springcontainer.user.User;

public class UserConifg01 {
	
	@Bean
	public User user() {
		return new User();
	}
}
