package com.cjc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.dao.HomeDao;
import com.cjc.model.Student;
@Repository
public class HomeDaoimpl implements HomeDao
{
   @Autowired
   SessionFactory sf;
	
	@Override
	public int savedata(Student stu) {
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
	int i=(int) s.save(stu);
	      tr.commit();
		
		return i ;
	}

	@Override
	public List<Student> loginCheck(String uname, String pass) {
		List<Student>list=new ArrayList();
		if(uname.equals("admin")&&pass.equals("admin"))
		{
			Session s=sf.openSession();
			Transaction tr=s.beginTransaction();
			Query query=s.createQuery("from Student");
			list=query.getResultList();
			
			
		}
		
		return list;
	}

	@Override
	public List<Student> deleteRecord(int rollno) {
		Session s=sf.openSession();
		Student stu=s.get(Student.class, rollno);
		s.delete(stu);
		Transaction tr=s.beginTransaction();
		Query query=s.createQuery("from Student");
		List<Student>list1=query.getResultList();
		
		return list1;
	}

	@Override
	public Student editRecord(int rollno) {
		Session s=sf.openSession();
		Student stu=s.get(Student.class, rollno);
		return stu;
	}

	@Override
	public List<Student> updateRecord(Student stu) {
		Session s=sf.openSession();
		s.update(stu);
		Transaction tr=s.beginTransaction();
		Query query=s.createQuery("from Student");
		List<Student>list2=query.getResultList();
		return list2;
	}
 
	
	
}
