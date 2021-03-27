package com.wcs.mvccrud.serviceinterface;

import java.util.List;

import com.wcs.mvccrud.model.Student;

public interface ServiceIntra 
{
  public void saveStudent(Student s);

public List<Student>loginStudent(String un, String ps);

public List<Student>getAllData();

public void Delete(int rollno);

public Student EditRecord(int rollno);

public void UpdateRecord(Student s);
	
	
}
