package com.example.ticketbookingsystem.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "bookingDeatail")
public class BookingDeatail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable=false)
    private Long id;
    @NotBlank(message = "Name is mandatory")
    private int seatNumber;
    @NotBlank(message = "Name is mandatory")
    private String passengerName;
    private Long passportCode;
    private String PassengerGender;

    @ManyToOne
    @JoinColumn(name="booking_id",nullable = false)
    private Booking booking;



}
