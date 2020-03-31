package com.niit.techno.crmnew.service;

import com.niit.techno.crmnew.model.Address;
import com.niit.techno.crmnew.model.EliteUser;

public interface EliteService {

	public void saveECustomer(Address add);
	
	public EliteUser checkUser(EliteUser theEUser);
	
}
