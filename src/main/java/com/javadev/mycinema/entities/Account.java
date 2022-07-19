package com.javadev.mycinema.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account_details")
public class Account extends BaseEntity{


    private String name;
    private String adress;
    private String city;
    private String state;
    private String postalCode;

    @OneToOne
    private User user;


}
