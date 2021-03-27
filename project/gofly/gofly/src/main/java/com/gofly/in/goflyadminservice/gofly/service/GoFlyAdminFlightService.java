package com.gofly.in.goflyadminservice.gofly.service;

import java.util.List;

import com.gofly.in.goflyadminservice.gofly.entity.GoFlyAdminFlight;
import com.gofly.in.goflyadminservice.gofly.model.GoFlyAdminRescheduleFlight;

public interface GoFlyAdminFlightService 
{
String addFlight(GoFlyAdminFlight flight);
String addFlights(List<GoFlyAdminFlight> flights);
GoFlyAdminFlight getFlight(String flightId);
List<GoFlyAdminFlight>getAllFlights();
GoFlyAdminFlight updateFlight(GoFlyAdminFlight flightToUpdate);
GoFlyAdminFlight rescheduleFlight(GoFlyAdminRescheduleFlight flightToReschedule);
String deleteFlight(String flightId);
}
