package com.user.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.user.entities.Details;
import com.user.user.services.UserService;

@RestController
public class Controller {
	@Autowired
	private UserService us;

	
	
	//Get the user
	@GetMapping("/signup")
	public List<Details> getUser(){
		return this.us.getUser();
	}
	
	@GetMapping("/signup/{user_id}")
	public Details getuser(@PathVariable String user_id) {
		return this.us.getUser(Integer.parseInt(user_id));
	}
	
	//add courses
	@PostMapping("/signup")
	public Details addCourse(@RequestBody Details details) {
		return this.us.addUser(details);
	}
	
	//put the course
		@PutMapping("/signup")
		public Details updateCourse(@RequestBody Details details ) {
			return this.us.updateUser(details);
		}
		
		//Delete the course
		@DeleteMapping("signup/{user_id}")
		public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String user_id){
			try {
				this.us.deleteUser(Integer.parseInt(user_id));
				return new ResponseEntity<>(HttpStatus.OK);	
			}	
			catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
		}
}
