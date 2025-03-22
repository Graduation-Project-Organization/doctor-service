package com.doctor.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@Table(name = "education_information")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EducationInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String schoolName;
    private int graduationYear;
    private String specialization;
    @ElementCollection
    @CollectionTable(name = "education_specialities", joinColumns = @JoinColumn(name = "education_id"))
    @Column(name = "speciality")
    private Set<String> specialities;
    @Lob
    private byte[] profileImage;
}
