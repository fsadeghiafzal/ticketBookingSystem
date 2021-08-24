package com.example.ticketbookingsystem.repository;

import com.example.ticketbookingsystem.model.Booking;
import com.example.ticketbookingsystem.model.Reserve;
import com.example.ticketbookingsystem.model.ReserveRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<Booking,Long>
{

}
