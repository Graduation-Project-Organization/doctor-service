package com.doctor.app.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Set;

@Document(collection = "doctors")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Doctor {
    @Id
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String email;
    private int phoneNumber;
    private String city;
    private String state;
    private String country;
    private String educationHistory;
    private String research;
    private String awards;
    private byte[] additionalDocument;
    private String schoolName;
    private int graduationYear;
    private String specialization;
    private Set<String> specialities;
    private byte[] educationProfileImage;
    private int medicalLicense;
    private int yearsOfExperience;
    private Date medicalLicenseExpiryDate;
    private String biography;
    private byte[] profileImage;
    private String hospitalName;
    private String hourlyCharge;
    private String hospitalAddress;
    private String hospitalContactNumber;
    private String hospitalEmail;
    private String hospitalWebsite;
    private String hospitalHoursOfOperation;
    private boolean insurance;
    private Set<String> hospitalServices;
}
