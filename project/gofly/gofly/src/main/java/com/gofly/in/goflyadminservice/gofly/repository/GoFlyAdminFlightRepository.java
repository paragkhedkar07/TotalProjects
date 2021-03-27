package com.gofly.in.goflyadminservice.gofly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gofly.in.goflyadminservice.gofly.entity.GoFlyAdminFlight;
@Repository
public interface GoFlyAdminFlightRepository extends JpaRepository<GoFlyAdminFlight, String> 
{


}
