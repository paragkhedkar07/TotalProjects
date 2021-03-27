package com.webcore.app.loan.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.User;
import com.webcore.app.loan.main.repository.HomeRepository;

@Primary
@Service
public class HomeServiceImpl implements HomeService{
    
	@Autowired
   HomeRepository r;
	@Override
	public void savedata(User u) {
		
		r.save(u);
	}
	@Override
	public List<User> getdata() {
	List<User>u= (List<User>)r.findAll();
		return u;
	}

}
