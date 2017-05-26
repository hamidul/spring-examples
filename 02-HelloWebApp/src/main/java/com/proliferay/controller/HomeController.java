package com.proliferay.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 
 * @author hamidul.islam
 *
 */
@Controller
public class HomeController {
	@RequestMapping(value = "/", method = GET)
	public String home() {
		return "home";
	}
}

