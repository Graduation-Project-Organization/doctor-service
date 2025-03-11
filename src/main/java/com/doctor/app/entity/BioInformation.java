package com.doctor.app.entity;

import java.util.Date;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bio_information")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BioInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
}
