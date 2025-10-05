package com.MobaApplication.Moba.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
@GetMapping("/Event")
	public String Event() {
		return "Event for the diwali so all member present";
	}
	}
