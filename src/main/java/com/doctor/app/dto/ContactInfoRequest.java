package com.doctor.app.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ContactInfoRequest {
    @NotEmpty(message = "Email address is required")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@gmail\\.com$", message = "Email should be a valid Gmail address")
    private String email;
    @NotEmpty(message = "Phone number is required")
    private String phoneNumber;
    @NotEmpty(message = "Country is required")
    private String country;
    @NotEmpty(message = "City is required")
    private String city;
    @NotEmpty(message = "State is required")
    private String state;
}
