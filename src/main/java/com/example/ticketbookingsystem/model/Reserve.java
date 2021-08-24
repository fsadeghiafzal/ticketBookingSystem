package com.example.ticketbookingsystem.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor

public class Reserve {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable=false)
    private long id;
    private Flight flight;
    private Booking booking;
    private BookingDeatail bookingDeatail;

}

