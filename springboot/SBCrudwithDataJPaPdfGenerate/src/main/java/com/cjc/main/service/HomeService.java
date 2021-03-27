package com.cjc.main.service;

import java.util.List;

import com.cjc.main.model.Student;

public interface HomeService {

	void savedata(Student stu);

	List<Student> loginCheck(String uname, String pass);

	Iterable<Student> getAlldata();

	void deleteRecord(int rollno);

	Student editRecord(int rollno);

	Iterable<Student> findAll();
	

	

	
}
