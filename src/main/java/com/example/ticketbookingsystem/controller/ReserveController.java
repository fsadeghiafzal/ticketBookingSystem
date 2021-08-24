package com.example.ticketbookingsystem.controller;
import com.example.ticketbookingsystem.exeption.ExceptionsInJava;
import com.example.ticketbookingsystem.model.ReserveRequest;
import com.example.ticketbookingsystem.service.ReserveService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/reserve")
public class ReserveController
{
    @Value("${spring.application.name}")
    final static Logger logger = LoggerFactory.getLogger(ReserveController.class);   // protected final Log4j logger=
    private ReserveService reserveService;

    @PostMapping("/newReserve")
    public ResponseEntity<String> validateBody(@Validated @RequestBody ReserveRequest reserveRequest) throws ExceptionsInJava
    {
        reserveService.checkedValidate(reserveRequest);
        logger.debug("log {}", reserveRequest);
        return ResponseEntity.ok("valid");
    }

    @PostMapping("/addBooking")
    public ResponseEntity<String> addBooking(@Validated @RequestBody ReserveRequest reserveRequest) throws ExceptionsInJava {
        {
            reserveService.addBooking(reserveRequest);
            logger.debug("log {}", reserveRequest);
            return ResponseEntity.ok("valid");

        }


    }
}