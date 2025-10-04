package com.MobaApplication.Moba.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/welcome")
	public String addguest() {
		return "Wlecome to all Guest";
	}

}
