package com.appdirecttest;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class AppDirectTest {
 
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World</h3>This message is coming from AppDirectTest.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}