package com.doctor.app.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BioInfoRequest {
    @NotEmpty(message = "First name is required")
    private String firstName;
    private String middleName;
    @NotEmpty(message = "Last name is required")
    private String lastName;
    @NotEmpty(message = "Date of birth is required")
    private Date dateOfBirth;
    @NotEmpty(message = "Gender is required")
    private String gender;
}
