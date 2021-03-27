package com.parag.main.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parag.main.model.Student;
import com.parag.main.repository.HomeRepository;
import com.parag.main.service.HomeService;


@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;

	
	@Override
	public void getData(Student stu) {
		hr.findAll();
		
	}

	
	
	
}
