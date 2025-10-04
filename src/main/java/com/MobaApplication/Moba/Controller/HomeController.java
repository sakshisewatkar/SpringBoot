package com.MobaApplication.Moba.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping("/home")
	public String homeadd() {
	return "wlecome to the home member";
	}

}
