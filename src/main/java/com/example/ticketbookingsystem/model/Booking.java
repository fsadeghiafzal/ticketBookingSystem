package com.example.ticketbookingsystem.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "booking")
public class Booking
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable=false)
    private long id;
    private String rezerveDate;
    private Long rezerveNumber;

    @OneToMany(mappedBy = "booking",cascade = CascadeType.ALL)
    private List<BookingDeatail> bookingDeatails;

    public void addBooking(List<BookingDeatail> bookingDeatailInput)
    {
        if(bookingDeatails==null)
            bookingDeatails=new ArrayList<BookingDeatail>();
       for(BookingDeatail i:bookingDeatailInput)
       {
           i.setBooking(this);
           bookingDeatails.add(i);
       }
    }

    @ManyToOne
    @JoinColumn(name="customer_id",nullable = false)
    private Customer customer;

}
