package com.doctor.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "doctors")
@AllArgsConstructor
@NoArgsConstructor
@Data
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
}
