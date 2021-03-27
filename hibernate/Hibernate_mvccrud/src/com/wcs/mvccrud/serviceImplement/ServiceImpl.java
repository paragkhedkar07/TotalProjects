package com.wcs.mvccrud.serviceImplement;

import java.util.List;

import com.wcs.mvccrud.DaoI.DaoIntra;
import com.wcs.mvccrud.Daoimpl.DaoImpl;
import com.wcs.mvccrud.model.Student;
import com.wcs.mvccrud.serviceInterface.ServiceIntra;

public class ServiceImpl implements ServiceIntra
{
	DaoIntra dio=new DaoImpl();
	@Override
	public void saveStudent(Student s) {
		
		dio.saveStudent(s);
		System.out.println("in serviceImpl");
		
		
	}
	public List<Student> loginStudent(String un, String ps) 
	{
	
		System.out.println("in serviceImpllog");
		return dio.loginStudent(un,ps);
	}
	public List<Student> getAllData1() 
	{
		return dio.getAllData1();
	}
	@Override
	public void Delete(int rollno) {
	dio.Delete(rollno);
	
	}
	@Override
	public Student EditRecord(int rollno) {
		return dio.EditRecord(rollno);
		
		
	}
	public void UpdateRecord(Student s) {
		
		dio.UpdateRecord(s);
	}
	
	

	

}
