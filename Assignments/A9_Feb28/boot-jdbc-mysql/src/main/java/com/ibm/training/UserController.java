package com.ibm.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService service;

	@RequestMapping("/users")
	List<User> getUsers(){
		return service.getUsers();
	}
	
	@RequestMapping("/users/{id}")
	User getUserById(@PathVariable int id){
		return service.getUserById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "users/{accNum}")
	void updateDetails(@PathVariable int accNum, @RequestBody User user ) {
		service.updateBalance(accNum,user);
		}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "users/{accNum}")
	void deleteAccount(@PathVariable int accNum) {
		service.deleteAccount(accNum);
		}
	}

