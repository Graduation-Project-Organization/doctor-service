package com.doctor.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "additional_information")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdditionalInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String educationHistory;
    private String research;
    private String awards;
    private byte[] additionalDocument;
}
