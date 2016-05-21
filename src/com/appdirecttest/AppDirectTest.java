package com.appdirecttest;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.appdirecttest.models.Subscription;
import com.appdirecttest.models.User;
import com.appdirecttest.repositories.impl.SubscriptionRepositoryMySql;
import com.appdirecttest.repositories.impl.UserRepositoryMySql;

/**
 * Welcome page, soon it will be able to list users
 * @author victoria
 *
 */
@Controller
public class AppDirectTest {   
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "Here should be some lists but integration is still in progress";
		return new ModelAndView("welcome", "message", message);
	}
}
