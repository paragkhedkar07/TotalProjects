package com.crud.main.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.main.entity.Author;
import com.crud.main.service.Service;



@RestController
public class Controller {
     private static final Logger log=LoggerFactory.getLogger(Controller.class);
     @Autowired
     Service service;
     @PostMapping(value = "/author/add")
 	private ResponseEntity<String> addFlight( @RequestBody Author author,BindingResult result)
 	{
 		log.info("#############"+" add author "+"###########");
 		String respMessage;
 		HttpStatus httpStatus;
 		if(result.hasErrors())
		{
			respMessage ="invalid author: "+result.getAllErrors();
			httpStatus=HttpStatus.BAD_REQUEST;
			
			return new ResponseEntity<String>(respMessage, httpStatus);
		}
		respMessage =service.addAuthor(author);
		httpStatus=HttpStatus.CREATED;
		
		return new ResponseEntity<String>(respMessage, httpStatus);
	}
	
	
}
