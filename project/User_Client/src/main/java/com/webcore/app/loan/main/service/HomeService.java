package com.webcore.app.loan.main.service;

import java.util.List;

import com.webcore.app.loan.main.model.User;

public interface HomeService {

	public void savedata(User u);

	public List<User> getdata();

}
