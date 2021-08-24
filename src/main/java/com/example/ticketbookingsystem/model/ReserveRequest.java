package com.example.ticketbookingsystem.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor

public class ReserveRequest {
    private Booking booking;
    private List<BookingDeatail> bookingDeatails;
    private Customer customer;
    private String userName;
}
