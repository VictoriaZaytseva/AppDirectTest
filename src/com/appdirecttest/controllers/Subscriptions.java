package com.appdirecttest.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.appdirecttest.models.Response;
import com.appdirecttest.models.User;
import com.appdirecttest.models.notification.Notification;

@RestController
public class Subscriptions {

@RequestMapping("/create")	
public @ResponseBody Response create(@RequestBody Notification notification){
	Response response = new Response(false, notification.toString(), "ACCOUNT_NOT_FOUND");
	return response;
}	
//	  
// create subscription
	
//  @RequestMapping("/subscription/cancel")
// subscription canceled :P		
}
