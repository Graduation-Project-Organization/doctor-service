package com.doctor.app.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PracticeInfoRequest {
    @NotEmpty(message = "Hospital name is required")
    private String hospitalName;
    @NotEmpty(message = "Hourly charge is required")
    private String hourlyCharge;
    @NotEmpty(message = "Hospital address is required")
    private String hospitalAddress;
    @NotEmpty(message = "Hospital contact number is required")
    private String hospitalContactNumber;
    @NotEmpty(message = "Hospital email is required")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$", message = "Email should be a valid Gmail address")
    private String hospitalEmail;
    private String hospitalWebsite;
    @NotEmpty(message = "Hospital hours of operation is required")
    private String hospitalHoursOfOperation;
    private boolean insurance;
    private Set<String> hospitalServices;
}
