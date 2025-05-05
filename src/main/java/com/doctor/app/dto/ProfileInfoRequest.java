package com.doctor.app.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProfileInfoRequest {
    @NotEmpty(message = "Medical License is required")
    @Size(max = 20)
    private String medicalLicense;
    @NotEmpty(message = "Years of experience is required")
    private Integer yearsOfExperience;
    @NotEmpty(message = "Medical License expiry date is required")
    private Date medicalLicenseExpiryDate;
    @NotEmpty(message = "Biography is required")
    private String biography;
    private MultipartFile profileImage;
}
