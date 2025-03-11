package com.doctor.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "profile_information")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProfileInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int medicalLicense;
    private int yearsOfExperience;
    private Date medicalLicenseExpiryDate;
    private String biography;
    @Lob
    private byte[] profileImage;
}
