package com.gofly.in.goflyadminservice.gofly.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gofly.in.goflyadminservice.gofly.entity.GoFlyAdminFlight;
import com.gofly.in.goflyadminservice.gofly.model.GoFlyAdminRescheduleFlight;
import com.gofly.in.goflyadminservice.gofly.repository.GoFlyAdminFlightRepository;

@Service
public class GoFlyAdminFlightServiceImpl implements GoFlyAdminFlightService
{
@Autowired
GoFlyAdminFlightRepository  goFlyAdminFlightRepository;

	@Override
	public String addFlight(GoFlyAdminFlight flight) {
	goFlyAdminFlightRepository.save(flight);
		return "Flight:"+flight.getFlightId()+" "+"Added Successfully!";
	}

	@Override
	public String addFlights(List<GoFlyAdminFlight> flights) {
		goFlyAdminFlightRepository.saveAll(flights);
		return "all flights Added Successfully!";
	}

	@Override
	public GoFlyAdminFlight getFlight(String flightId) {
		Optional<GoFlyAdminFlight> optionalflight=goFlyAdminFlightRepository.findById(flightId);
		
try
{		return optionalflight.get();

} catch(NoSuchElementException e)
{
	return null;

}
   
		
	}
	
	@Override
	public List<GoFlyAdminFlight> getAllFlights() {
		
		
		return goFlyAdminFlightRepository.findAll();
	}


	@Override
	public GoFlyAdminFlight updateFlight(GoFlyAdminFlight flightToUpdate) {
		Optional<GoFlyAdminFlight> optionalflight=goFlyAdminFlightRepository.findById(flightToUpdate.getFlightId());
		
		if(optionalflight.isPresent())
		{
			goFlyAdminFlightRepository.save(flightToUpdate);
			return flightToUpdate;
		}
			
		
		return null;
	}

	@Override
	public String deleteFlight(String flightId) {
		Optional<GoFlyAdminFlight> optionalflight=goFlyAdminFlightRepository.findById(flightId);
		
		if(optionalflight.isPresent())
		{
			goFlyAdminFlightRepository.deleteById(flightId);
			return "flight:"+flightId+" removed from records!";
		}
		
		
		return null;
	}

	
	@Override
	public GoFlyAdminFlight rescheduleFlight(GoFlyAdminRescheduleFlight flightToReschedule) {
	Optional<GoFlyAdminFlight> optionalflight=goFlyAdminFlightRepository.findById(flightToReschedule.getFlightId());
		
	if(optionalflight.isPresent())
	{
		GoFlyAdminFlight flight=optionalflight.get();
		
	 flight.setFlightDepartureTime(flightToReschedule.getFlightDepartureTime());	
	 flight.setFlightDepartureDate(flightToReschedule.getFlightDepartureDate());
	 flight.setFlightArrivalTime(flightToReschedule.getFlightArrivalTime());
	 flight.setFlightArrivalDate(flightToReschedule.getFlightArrivalDate());
		
		goFlyAdminFlightRepository.save(flight);
		return flight;
	}
	
		return null;
	}

}
