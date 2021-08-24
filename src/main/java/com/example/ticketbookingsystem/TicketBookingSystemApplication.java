package com.example.ticketbookingsystem;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TicketBookingSystemApplication {

    public static void main(String[] args) {
        log.info("startApp");
        SpringApplication.run(TicketBookingSystemApplication.class, args);
        log.info("endApp");

    }

}
