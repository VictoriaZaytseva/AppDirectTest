package com.appdirecttest.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.appdirecttest.models.Response;
import com.appdirecttest.models.Subscription;
import com.appdirecttest.models.User;
import com.appdirecttest.models.notification.Notification;
import com.appdirecttest.services.SubscriptionService;

/**
 * Contorller responsible for handling subscription events
 * @author victoria
 *
 */
@RestController
public class Subscriptions {

	@Autowired
	private SubscriptionService subscriptionService;

	@RequestMapping(value = "/create", method = { RequestMethod.GET })
	public @ResponseBody Response create(@RequestParam String url) {

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Notification> result = restTemplate.getForEntity(url, Notification.class);
		Notification notification = result.getBody();

		User user = new User(notification.creator.uuid, notification.creator.email, notification.creator.openId,
				notification.payload.company.uuid);

		Subscription subscription = new Subscription(
				notification.payload.company.uuid,
				notification.payload.company.name, "Active", // TODO: remove
				// magic String
				notification.payload.order.editionCode);
		Response response;
		try {
			subscriptionService.create(user, subscription);
			response = new Response(true, notification.payload.company.uuid);
		} catch (SQLException e) {
			// Response.ErrorCode.USER_ALREADY_EXISTS.toString()
			response = new Response(false, "This account already exists", e.toString());

		} catch (Exception e) {
			response = new Response(false, "Not sql exception", e.toString());
		}
		return response;
	}

	@RequestMapping(value = "/cancel", method = { RequestMethod.GET })
	public @ResponseBody Response cancel(@RequestParam String url) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Notification> result = restTemplate.getForEntity(url, Notification.class);
		Notification notification = result.getBody();
		Response response;
		try {
			subscriptionService.cancel(notification.payload.company.uuid, "DEACTIVATED");
			response = new Response(true, notification.payload.company.uuid);
		} catch (SQLException e) {
			response = new Response(false, "Can't find the account", e.toString());
		} catch (Exception e) {
			response = new Response(false, "Not sql exception", e.toString());
		}
		return response;
	}
}
