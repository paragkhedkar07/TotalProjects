package com.cjc.main.repository;


import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>
{

	List<Student> findAllByUnAndPs(String uname, String pass);

	Student findByRollno(int rollno);

	

	
}
	
	

