package com.tts.UsersAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tts.UsersAPI.model.User;
import com.tts.UsersAPI.repository.UserRepository;


@RestController
public class UserController {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserController (UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/")
    public String main() {
        return "main";
    }
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(@RequestParam(value="state", required=false) String state){
		if (state != null) {
			
			
//			return (List<User>) userRepository.findByState(state); 
//	}
//		return (List<User>) userRepository.findAll(); {
			
		}
		return new ResponseEntity<List<User>>(HttpStatus.OK);
		
	}
		
	
	@GetMapping("/users/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable(value="id") Long id){
		Optional<User> user = userRepository.findById(id);
		if(!user.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user){
	userRepository.save(user);
		
	}
	
	@DeleteMapping("/users/{id}")
	public void createUser(@PathVariable(value="id") Long id) {
		userRepository.deleteById(id);
	}
	
}
