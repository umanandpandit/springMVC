package com.niit.techno.crmnew.dao;

import com.niit.techno.crmnew.model.Address;
import com.niit.techno.crmnew.model.EliteUser;

public interface EliteDAO {

	void saveECustomer(Address add);
	public EliteUser checkUser(EliteUser theUser);
	
}

