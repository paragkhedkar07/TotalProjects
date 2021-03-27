package com.wcs.mvccrud.daoimplement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.wcs.mvccrud.daointerface.DaoIntra;
import com.wcs.mvccrud.hybernateutil.HibernateUtil;
import com.wcs.mvccrud.model.Student;

public class DaoImpl implements DaoIntra 
{

	@Override
	public void saveStudent(Student s) 
	{
		Session session =HibernateUtil.getSessionFactory().openSession();
		session.save(s);
		session.beginTransaction().commit();
		
		
	}

	@Override
	public List<Student> loginStudent(String un, String ps) 
	{
		List<Student>list=new ArrayList();
		if(un.equals("admin")&&ps.equals("admin"))
		{
			
			Session session=HibernateUtil.getSessionFactory().openSession();
	        Query query=session.createQuery("from Student");
	        list=query.getResultList();
		}
		else
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
	        Query query=session.createQuery("from Student where un='"+un+"' AND ps='"+ps+"')");
	        list=query.getResultList();
			
		}
		
		return list;
	}

	@Override
	public List<Student> getAllData() 
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		List<Student>list=session.createQuery("from Student",Student.class).getResultList();
		return list;
	}

	@Override
	public void Delete(int rollno) 
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Student s=session.get(Student.class, rollno);
		session.delete(s);
		session.beginTransaction().commit();
		
	}

	@Override
	public Student EditRecord(int rollno) 
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		Student s1=session.get(Student.class, rollno);
		return s1;
	}

	@Override
	public void UpdateRecord(Student s) 
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.update(s);
		session.beginTransaction().commit();
		
		
	}
}
