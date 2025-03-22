package com.doctor.app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "practice_information")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PracticeInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String hospitalName;
    private String hourlyCharge;
    private String hospitalAddress;
    private String hospitalContactNumber;
    private String hospitalEmail;
    private String hospitalWebsite;
    private String hospitalHoursOfOperation;
    private boolean insurance;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "hospital_services", joinColumns = @JoinColumn(name = "practice_id"))
    @Column(name = "service")
    private Set<String> hospitalServices;
}
