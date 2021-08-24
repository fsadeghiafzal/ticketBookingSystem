package com.example.ticketbookingsystem.model;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customer")
@NoArgsConstructor
    public class Customer
    {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable=false)
    private long id;
    @NotEmpty(message="FirstName cannot be empty")
    @Size(min=1,max=6,message="Size should be between 1 to 6")
    private String name;
    @NotNull
    @Size(min=1,max=6,message="Size should be between 1 to 6")
    private  String family;
    private int age;
    @NotEmpty(message="Email Address cannot be empty")
    private String email;
    private String gender;
    private String password;
    private String userName;
    private String phoneNumber;
    private Long nationalCode;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Set<Booking> bookings;

    public void addCustomer(Booking booking)
    {
        if(bookings==null)
            bookings=new HashSet<Booking>();
        booking.setCustomer(this);
        bookings.add(booking);
    }



}
