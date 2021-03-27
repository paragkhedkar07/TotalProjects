package com.wcs.mvccrud.DaoI;

import java.util.List;

import com.wcs.mvccrud.model.Student;

public interface DaoIntra 
{
	 void saveStudent(Student s);

	

	List<Student> loginStudent(String un, String ps);
	
	List<Student> getAllData1();


	void Delete(int rollno);



	Student EditRecord(int rollno);

    void UpdateRecord(Student s);

	
	
	
}
