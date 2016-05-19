package com.appdirecttest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.appdirecttest.models.Response;
import com.appdirecttest.models.User;

@RestController
public class Subscriptions {

@RequestMapping("/create")	
public @ResponseBody Response create(){
	Response response = new Response(false, "Ooops", "ACCOUNT_NOT_FOUND");
	return response;
}	
//	  
// create subscription
	
//  @RequestMapping("/subscription/cancel")
// subscription canceled :P		
}
