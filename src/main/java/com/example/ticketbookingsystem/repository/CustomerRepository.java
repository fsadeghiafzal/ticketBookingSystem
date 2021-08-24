package com.example.ticketbookingsystem.repository;

import com.example.ticketbookingsystem.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long>
{

    Customer findBynationalCode(Long nationalCode);
    Customer findByuserName(String userName);




}
