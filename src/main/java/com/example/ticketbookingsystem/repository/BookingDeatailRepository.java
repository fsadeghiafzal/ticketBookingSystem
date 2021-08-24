package com.example.ticketbookingsystem.repository;

import com.example.ticketbookingsystem.model.BookingDeatail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingDeatailRepository extends CrudRepository<BookingDeatail,Long>
{

}
