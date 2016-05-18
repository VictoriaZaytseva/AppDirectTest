package com.appdirecttest;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import com.appdirecttest.models.User;
import com.appdirecttest.repositories.impl.UserRepositoryMySql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class AppDirectTest {
 
	@Autowired
	private UserRepositoryMySql userRepositoryMySql;

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		User user =  new User("111", "zzz", "zzz", "zzz", "zzz", "zz", "eng");
		userRepositoryMySql.insert(user);
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World</h3>This message is coming from AppDirectTest.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
