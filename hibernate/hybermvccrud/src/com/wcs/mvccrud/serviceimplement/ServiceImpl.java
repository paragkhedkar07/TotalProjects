package com.wcs.mvccrud.serviceimplement;

import java.util.List;

import com.wcs.mvccrud.daoimplement.DaoImpl;
import com.wcs.mvccrud.daointerface.DaoIntra;
import com.wcs.mvccrud.model.Student;
import com.wcs.mvccrud.serviceinterface.ServiceIntra;

public class ServiceImpl implements ServiceIntra {
	
	DaoIntra dio=new DaoImpl();
	
	public void saveStudent(Student s) 
	{
		dio.saveStudent(s);
		
	}

	@Override
	public List<Student>loginStudent(String un, String ps) 
	{
		
		return dio.loginStudent(un,ps);
	}

	@Override
	public List<Student> getAllData() {
		
		return dio.getAllData();
	}

	@Override
	public void Delete(int rollno) {
		dio.Delete(rollno);
		
	}

	@Override
	public Student EditRecord(int rollno) {
		
		return dio.EditRecord(rollno);
	}

	@Override
	public void UpdateRecord(Student s) {
		  dio.UpdateRecord(s);
		
	}

}
