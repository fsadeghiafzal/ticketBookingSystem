package com.example.ticketbookingsystem.service;
import com.example.ticketbookingsystem.exeption.ExceptionsInJava;
import com.example.ticketbookingsystem.model.Customer;
import com.example.ticketbookingsystem.model.ReserveRequest;
import com.example.ticketbookingsystem.repository.BookingRepository;
import com.example.ticketbookingsystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ReserveService
{
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private CustomerRepository customerRepository;


    public boolean checkedValidate( ReserveRequest reserveRequest) throws ExceptionsInJava
    {
        Pattern pattern = Pattern.compile("^21([1-9])");
        Matcher matcher = pattern.matcher(reserveRequest.getCustomer().getPhoneNumber());
        System.out.println(matcher.matches());
        if(!matcher.matches())
         {
            throw new ExceptionsInJava("Incorrect PhoneNumber");
         }
        return newReserve(reserveRequest);
    }

    @Transactional()
    public boolean newReserve(ReserveRequest reserveRequest)throws ExceptionsInJava
    {
           Customer customer= customerRepository.findBynationalCode(reserveRequest.getCustomer().getNationalCode());
            if(customer!=null)
                throw new ExceptionsInJava("The customer exists with this code");
            reserveRequest.getCustomer().addCustomer(reserveRequest.getBooking());
            customerRepository.save(reserveRequest.getCustomer());
            reserveRequest.getBooking().addBooking(reserveRequest.getBookingDeatails());
            bookingRepository.save(reserveRequest.getBooking());
            return true;
    }

    public void addBooking(ReserveRequest reserveRequest)throws ExceptionsInJava
    {
        Customer customer=customerRepository.findByuserName(reserveRequest.getUserName());
        if(customer==null)
            throw new ExceptionsInJava("The customer not exists with this userName");
        reserveRequest.getBooking().setCustomer(customer);
        bookingRepository.save(reserveRequest.getBooking());
    }

}
