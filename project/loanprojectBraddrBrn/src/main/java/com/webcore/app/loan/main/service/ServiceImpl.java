package com.webcore.app.loan.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.Branch;
import com.webcore.app.loan.main.repository.HomeRepository;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	HomeRepository hr;
	
	
	@Override
	public void save(Branch b) {
		// TODO Auto-generated method stub
		hr.save(b);

		
	}

}
