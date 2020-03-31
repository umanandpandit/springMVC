package com.niit.techno.crmnew.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.techno.crmnew.dao.TravelDAO;
import com.niit.techno.crmnew.model.Travel;

@Service
public class TravelServiceImpl implements TravelService{

	@Autowired
	private TravelDAO travelDAO;

	@Transactional
	public void saveTravel(Travel tUser) {

	travelDAO.saveTravel(tUser);
	}

}
