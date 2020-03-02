package com.ibm.training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;

	List<User> getUsers(){
		return dao.getUsers();
	}

	public User getUserById(int id) {
		return dao.getUserById(id);
	}

	public void updateBalance(int accNum, User user) {
		 dao.updateBalance(accNum, user);
	}

	public void deleteAccount(int accNum) {
		dao.deleteAcount(accNum);
	}
}


