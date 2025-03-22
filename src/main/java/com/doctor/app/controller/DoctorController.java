package com.doctor.app.controller;

import com.doctor.app.dto.*;
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
    public ResponseEntity<?> saveBioData(@RequestBody BioInfoRequest bioInfoRequest,
                                         @PathVariable Integer id) {
        doctorService.saveBioInformation(id, bioInfoRequest);
        return ResponseEntity.ok("Bio data saved successfully");
    }

    @PostMapping("/{id}/profile-data")
    public ResponseEntity<?> saveProfileData(@RequestBody ProfileInfoRequest profileInfoRequest,
                                             @PathVariable Integer id) {
        doctorService.saveProfileInformation(id, profileInfoRequest);
        return ResponseEntity.ok("Profile data saved successfully");
    }

    @PostMapping("/{id}/contact-data")
    public ResponseEntity<?> saveContactData(@RequestBody ContactInfoRequest contactInfoRequest,
                                             @PathVariable Integer id) {
        doctorService.saveContactInformation(id, contactInfoRequest);
        return ResponseEntity.ok("Contact data saved successfully");
    }

    @PostMapping("/{id}/education-data")
    public ResponseEntity<?> saveEducationData(@RequestBody EducationInfoRequest educationInfoRequest,
                                               @PathVariable Integer id) {
        doctorService.saveEducationInformation(id, educationInfoRequest);
        return ResponseEntity.ok("Education data saved successfully");
    }

    @PostMapping("/{id}/practice-data")
    public ResponseEntity<?> savePracticeDate(@RequestBody PracticeInfoRequest practiceInfoRequest,
                                              @PathVariable Integer id) {
        doctorService.savePracticeInformation(id, practiceInfoRequest);
        return ResponseEntity.ok("Practice data saved successfully");
    }

    @PostMapping("/{id}/additional-data")
    public ResponseEntity<?> saveAdditionalData(@RequestBody AdditionalInfoRequest additionalInfoRequest,
                                              @PathVariable Integer id) {
        doctorService.saveAdditionalInformation(id, additionalInfoRequest);
        return ResponseEntity.ok("Practice data saved successfully");
    }
}
