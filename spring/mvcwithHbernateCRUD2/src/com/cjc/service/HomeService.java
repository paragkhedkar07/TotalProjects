package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface HomeService {

	int savedata(Student stu);

	List<Student> loginCheck(String uname, String pass);

	List<Student> deleteRecord(int rollno);

	Student editRecord(int rollno);

	List<Student> updateRecord(Student stu);



}
