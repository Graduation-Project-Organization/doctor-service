package com.doctor.app.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EducationInfoRequest {
    @NotEmpty(message = "School name is required")
    private String schoolName;
    @NotEmpty(message = "Graduation year is required")
    private int graduationYear;
    @NotEmpty(message = "Specialization is required")
    private String specialization;
    private Set<String> specialities;
    private MultipartFile profileImage;
}
