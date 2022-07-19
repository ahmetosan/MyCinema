package com.javadev.mycinema.entities;

import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "user_accounts")

public class User extends BaseEntity{


    private String email;
    private String password;
    private String userName;


    @OneToOne()
    private Account accountDetails;

    @OneToMany(mappedBy = "user")
    private List<Ticket> tickets;

}
