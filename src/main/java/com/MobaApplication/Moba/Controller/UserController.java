package com.MobaApplication.Moba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MobaApplication.Moba.Model.User;
import com.MobaApplication.Moba.Repository.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	@PostMapping("/user")
	public String createuser(@RequestBody User user ) {
		    userRepository.save(user);
		    return "User created successfully.";
		
	}
	@GetMapping("/alluser")
	public List<User> getalluser(){
		return userRepository.findAll();
	}

}
