package com.siemens.customerapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
@Entity
@Table(name="Customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@SuperBuilder
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
