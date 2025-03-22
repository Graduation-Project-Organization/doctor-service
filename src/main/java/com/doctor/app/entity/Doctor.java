package com.doctor.app.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "doctors")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bio_information_id")
    private BioInformation bioInformation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_information_id")
    private ProfileInformation profileInformation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_information_id")
    private ContactInformation contactInformation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "education_information_id")
    private EducationInformation educationInformation;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "practice_information_id")
    private PracticeInformation practiceInformation;
    private AdditionalInformation additionalInformation;
}
