package com.siemens.customerapi.models;

import jakarta.persistence.*;
import lombok.Data;

@Table(name="Customer")
@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Account_No")
    private long accountNo;
    @Embedded
    private FullName name;
    @Column(name = "Email",length = 150,nullable = false)
    private String email;
    @Column(name = "Password",length = 10,nullable = false)
    private String password;
    @Column(name = "Contact_No")
    private long contactNo;


}
