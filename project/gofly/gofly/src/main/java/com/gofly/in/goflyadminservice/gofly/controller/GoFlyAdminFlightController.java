package com.gofly.in.goflyadminservice.gofly.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gofly.in.goflyadminservice.gofly.entity.GoFlyAdminFlight;
import com.gofly.in.goflyadminservice.gofly.model.GoFlyAdminRescheduleFlight;
import com.gofly.in.goflyadminservice.gofly.service.GoFlyAdminFlightService;

@RestController
public class GoFlyAdminFlightController 
{
	
	private static final Logger log=LoggerFactory.getLogger(GoFlyAdminFlightController.class);
	@Autowired
	GoFlyAdminFlightService goFlyAdminFlightService;
	@PostMapping(value = "/flight/add")
	private ResponseEntity<String> addFlight(@Valid @RequestBody GoFlyAdminFlight flight,BindingResult result)
	{
		log.info("#############"+"Inside add flight"+"###########");
		String respMessage;
		HttpStatus httpStatus;
		if(result.hasErrors())
		{
			respMessage ="invalid Flight: "+result.getAllErrors();
			httpStatus=HttpStatus.BAD_REQUEST;
			
			return new ResponseEntity<String>(respMessage, httpStatus);
		}
		respMessage =goFlyAdminFlightService.addFlight(flight);
		httpStatus=HttpStatus.CREATED;
		
		return new ResponseEntity<String>(respMessage, httpStatus);
	}
	
	@PostMapping("/flights/add")
	// @RequestMapping(value= {"/flights/add","/add/flights","/flights/create"},method= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
	//@GetMapping("/flights/add")
	 private ResponseEntity<String>addFlights(@Valid @RequestBody List<GoFlyAdminFlight> flights)
	 {
		 String respMessage=goFlyAdminFlightService.addFlights(flights);
		 
		 return new ResponseEntity<String>(respMessage, HttpStatus.CREATED);
	 }
	
	@GetMapping("/flight/get/{flightId}")
	private ResponseEntity<Object>getFlight(@PathVariable String flightId)
	{
		GoFlyAdminFlight flight=goFlyAdminFlightService.getFlight(flightId);
		if(flight!=null)
		{
			return new ResponseEntity<Object>(flight,HttpStatus.OK);
			
		}
		    return new ResponseEntity<Object>("flight:"+flightId +"does not exist!!,",HttpStatus.NOT_FOUND);
		
	}
	
	@GetMapping("/flights/get")
	private ResponseEntity<List<GoFlyAdminFlight>>getAllFlights()
	{
		List<GoFlyAdminFlight> flights=goFlyAdminFlightService.getAllFlights();
		return new ResponseEntity<List<GoFlyAdminFlight>>(flights,HttpStatus.OK);
	}
	
	@PutMapping("/flight/update")
	 private ResponseEntity<Object>updateFlight(@Valid @RequestBody GoFlyAdminFlight flightToUpdate)
	 {
		GoFlyAdminFlight flight=goFlyAdminFlightService.updateFlight(flightToUpdate);
		if(flight !=null)
		{
			return new ResponseEntity<Object>(flight, HttpStatus.OK);
			
		}
		    return new ResponseEntity<Object>("flight:"+flightToUpdate.getFlightId() +"does not exist!!",HttpStatus.NOT_FOUND);
		
	}
	@PatchMapping("/flight/reschedule")
	 private ResponseEntity<Object> rescheduleFlight(@RequestBody GoFlyAdminRescheduleFlight flightPatch)
	 {
		GoFlyAdminFlight recheduledflight=goFlyAdminFlightService.rescheduleFlight(flightPatch);
		if(recheduledflight!=null)
		{
			return new ResponseEntity<Object>(recheduledflight, HttpStatus.OK);	
			
			
		}
		
	 return new ResponseEntity<Object>("flight:"+flightPatch.getFlightId() +"does not exist!!",HttpStatus.NOT_FOUND);
			
	}	
	
	@DeleteMapping("/flight/delete/{flightId}")
	private ResponseEntity<String>deleteFlight(@PathVariable String flightId)
	{
		
		
		String respMessage=goFlyAdminFlightService.deleteFlight(flightId);
		if(respMessage!=null)
		{
			return new ResponseEntity<String>(respMessage,HttpStatus.OK);
			
		}
		    return new ResponseEntity<String>("flight:"+flightId +"does not exist!!,",HttpStatus.NOT_FOUND);
		
	}
	
		
 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

