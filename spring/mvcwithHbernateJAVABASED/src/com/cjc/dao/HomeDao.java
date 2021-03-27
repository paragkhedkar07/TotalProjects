package com.cjc.dao;

import java.util.List;

import com.cjc.model.Student;

public interface HomeDao {

	int savedata(Student stu);

	List<Student> loginCheck(String uname, String pass);

	List<Student> deleteRecord(int rollno);

	Student editRecord(int rollno);

	List<Student> updateRecord(Student stu);

}
