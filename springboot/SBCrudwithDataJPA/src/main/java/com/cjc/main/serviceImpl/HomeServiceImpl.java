package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;

	@Override
	public void savedata(Student stu) {
		
		hr.save(stu);
	}

	@Override
	public List<Student> loginCheck(String uname, String pass) 
	{
		List<Student>list= hr.findAllByUnAndPs(uname,pass);
		return list;
		
	}

	@Override
	public Iterable<Student> getAlldata() {
	
		return hr.findAll();
	}

	@Override
	public void deleteRecord(int rollno) {
	           hr.deleteById(rollno);
		
	}

	@Override
	public Student editRecord(int rollno) {
		
		return hr.findByRollno(rollno);
		
	}

	

	
	
}
