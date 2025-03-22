package com.doctor.app.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AdditionalInfoRequest {
    @NotEmpty(message = "Education history is required")
    private String educationHistory;
    @NotEmpty(message = "Research is required")
    private String research;
    @NotEmpty(message = "Awards is required")
    private String awards;
    private MultipartFile additionalDocument;
}
