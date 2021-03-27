package com.crud.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.main.entity.Author;

@Service
public class ServiceImpl implements Service
{

	@Autowired
	Repository  Repository;

	@Override
	public String addAuthor(Author author) {
		
		return null;
	}

}
