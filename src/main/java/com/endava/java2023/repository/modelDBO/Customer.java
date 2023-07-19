package com.endava.java2023.repository.modelDBO;


import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int customerId;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    public int getCustomerId(){
        return customerId;
    }

    public String getName() {return name;}

    public String getEmail() {return email;}

    public Customer(){

    }
}
