package com.doctor.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contact_information")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ContactInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private int phoneNumber;
    private String city;
    private String state;
    private String country;
}
