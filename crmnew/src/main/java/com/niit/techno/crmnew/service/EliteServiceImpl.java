package com.niit.techno.crmnew.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.techno.crmnew.dao.EliteDAO;
import com.niit.techno.crmnew.model.Address;
import com.niit.techno.crmnew.model.EliteUser;

@Service
public class EliteServiceImpl implements EliteService {

	@Autowired
	private EliteDAO eliteDAO;
	
	@Transactional
	public void saveECustomer(Address add) {
		
		eliteDAO.saveECustomer(add);
		
	}

	@Transactional
	public EliteUser checkUser(EliteUser theEUser) {
		
		return eliteDAO.checkUser(theEUser);
				
	}

}
