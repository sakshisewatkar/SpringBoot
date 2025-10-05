package com.MobaApplication.Moba.Controller;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OfficeController {
	@GetMapping("/Office")
	public String office() {
	return "officeMember welcome on the event";
	}
}
