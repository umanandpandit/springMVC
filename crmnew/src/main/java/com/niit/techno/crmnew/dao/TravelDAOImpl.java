package com.niit.techno.crmnew.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.techno.crmnew.model.Travel;

@Repository
public class TravelDAOImpl implements TravelDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveTravel(Travel tUser) {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(tUser);

	}

}
