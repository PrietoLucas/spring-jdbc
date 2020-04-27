package br.com.rd.rtpps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rd.rtpps.repository.UserRepository;

@RestController
@RequestMapping(path="/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping
	public String check() {
		return "Welcome";
	}
	
	@GetMapping(path="/getusers")
	public List<String> getAllUserNames(){
		return userRepository.getAllUserNames();
	}
}
