package com.doctor.app.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DoctorRequest {
    @NotEmpty(message = "First Name cannot be empty")
    private String firstName;
    @NotEmpty(message = "Last Name cannot be empty")
    private String lastName;
    @NotEmpty(message = "Tracking Number cannot be empty")
    private String trackingNumber;
    @NotEmpty(message = "User Id cannot be empty")
    private ObjectId userId;
    @NotEmpty(message = "Email cannot be empty")
    private String email;
    @NotEmpty(message = "Phone Number cannot be empty")
    private String phoneNumber;
}
