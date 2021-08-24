package com.example.ticketbookingsystem.model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "flight")

public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",unique = true,nullable=false)
    private long id;
    private long capacity;
    private long prize;
    private String startLocation;
    private String endLocation;
}
