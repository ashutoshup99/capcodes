package com.cap.userspwejp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.userspwejp.entities.Userg;
import com.cap.userspwejp.repos.UsergRepository;

@RestController

public class UsergControllers {
	@Autowired
	UsergRepository usergRepository;
	
	
	@PostMapping("/users")
	public void addUser(@RequestBody Userg e) {
		usergRepository.save(e);
	}
	
	@GetMapping("/users/{id}")
	public Optional<Userg> finduserbyid(@PathVariable("id") int id) {
		return usergRepository.findById(id);
	}
	
	@GetMapping("/userse/{email}")
	public Optional<Userg> finduserbyemail(@PathVariable("email") String email) {
		return usergRepository.findByEmail(email);
	}
	@GetMapping("/userses/{email}/{password}")
	public Optional<Userg> finduserbyemailandpass(@PathVariable("email") String email,@PathVariable("password")String password) {
		return usergRepository.findByEmailAndPassword(email, password);
	}
	
	@GetMapping("/users")
	public List<Userg> findAllUsers(){
		System.out.println("Method mapped to Http....");
		return usergRepository.findAll();
	}
}
