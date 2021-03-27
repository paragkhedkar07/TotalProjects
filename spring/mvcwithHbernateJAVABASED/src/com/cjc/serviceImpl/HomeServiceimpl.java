package com.cjc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.HomeDao;
import com.cjc.model.Student;
import com.cjc.service.HomeService;
@Service
public class HomeServiceimpl implements HomeService {

	@Autowired
	HomeDao hd;
	
	
	@Override
	public int savedata(Student stu) {
		
		return hd.savedata(stu);
	}


	@Override
	public List<Student> loginCheck(String uname, String pass) {
		
		return hd.loginCheck(uname,pass);
	}


	@Override
	public List<Student> deleteRecord(int rollno) {
	
		return hd.deleteRecord( rollno);
	}


	@Override
	public Student editRecord(int rollno) {
		
		return hd.editRecord( rollno);
	}


	@Override
	public List<Student> updateRecord(Student stu) {
		
		return hd.updateRecord(stu);
	}
	
	
}
