package com.javadev.mycinema.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Ticket extends BaseEntity{

    private LocalDate datetime;
    private String seatNumber;
    private LocalDate rowNumber;


    @ManyToOne
    private User user;



}
