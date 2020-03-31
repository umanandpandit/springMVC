package com.niit.techno.crmnew.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.techno.crmnew.dao.UserDAO;
import com.niit.techno.crmnew.model.User;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Transactional
	public User checkUser(User theUser) {

		return userDAO.checkUser(theUser);
	}

}
