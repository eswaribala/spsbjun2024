package com.siemens.customerapi.models;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(hidden = true)
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
