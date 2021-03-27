package com.wcs.mvccrud.daoimplement;

import org.hibernate.Session;

import com.wcs.mvccrud.HybernateUtil.HybernateUtil;
import com.wcs.mvccrud.daointerface.daoIntra;
import com.wcs.mvccrud.model.Student;

public class DaoImpl implements daoIntra 
{

	@Override
	public void saveStudent(Student s) {
	
		
		Session session=HybernateUtil.getSessionFactory().openSession();
		session.save(s);
		session.beginTransaction().commit();
		
	}
   
	
	
	
	
}
