package com.wcs.mvccrud.ServiceImplement;

import com.wcs.mvccrud.ServiceInterface.ServiceIntra;
import com.wcs.mvccrud.daoimplement.DaoImpl;
import com.wcs.mvccrud.daointerface.daoIntra;
import com.wcs.mvccrud.model.Student;

public class ServiceImpl implements ServiceIntra 
{  
	daoIntra dao=new DaoImpl();

	@Override
	public void saveStudent(Student s) {
		dao.saveStudent(s);
		
	}

	

	
	
}
