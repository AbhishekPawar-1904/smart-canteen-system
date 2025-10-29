package com.rcpit.canteensystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rcpit.canteensystem.dao.UserDao;
import com.rcpit.canteensystem.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	// In a real application, you would add logic here,
	// like hashing the password before saving.
	public void registerUser(User user) {
		userDao.insertUser(user);
	}
}