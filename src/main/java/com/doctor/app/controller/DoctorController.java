package com.doctor.app.controller;

import com.doctor.app.dto.BioInformationRequest;
import com.doctor.app.dto.ContactInformationRequest;
import com.doctor.app.dto.ProfileInformationRequest;
import com.doctor.app.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/onboarding")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @PostMapping("/{id}/bio-data")
    public ResponseEntity<?> saveBioData(@RequestBody BioInformationRequest bioInformationRequest,
                                         @PathVariable Integer id) {
        doctorService.saveBioInformation(id, bioInformationRequest);
        return ResponseEntity.ok("Bio data saved successfully");
    }

    @PostMapping("/{id}/profile-data")
    public ResponseEntity<?> saveProfileData(@RequestBody ProfileInformationRequest profileInformationRequest,
                                             @PathVariable Integer id) {
        doctorService.saveProfileInformation(id, profileInformationRequest);
        return ResponseEntity.ok("Profile data saved successfully");
    }

    @PostMapping("/{id}/contact-data")
    public ResponseEntity<?> saveProfileData(@RequestBody ContactInformationRequest contactInformationRequest,
                                             @PathVariable Integer id) {
        doctorService.saveContactInformation(id, contactInformationRequest);
        return ResponseEntity.ok("Profile data saved successfully");
    }
}
