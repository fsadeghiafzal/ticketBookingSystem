package com.example.ticketbookingsystem.repository;

import com.example.ticketbookingsystem.model.Customer;
import com.example.ticketbookingsystem.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends CrudRepository<Flight,Long> {
}
