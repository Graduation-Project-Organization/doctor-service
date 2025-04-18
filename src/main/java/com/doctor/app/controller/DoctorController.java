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

    @PostMapping("/{userId}/bio-data")
    public ResponseEntity<?> saveBioData(@RequestBody BioInfoRequest bioInfoRequest,
                                         @PathVariable String userId) {
        doctorService.saveBioInformation(userId, bioInfoRequest);
        return ResponseEntity.ok("Bio data saved successfully");
    }

    @PostMapping("/{userId}/profile-data")
    public ResponseEntity<?> saveProfileData(@RequestBody ProfileInfoRequest profileInfoRequest,
                                             @PathVariable String userId) {
        doctorService.saveProfileInformation(userId, profileInfoRequest);
        return ResponseEntity.ok("Profile data saved successfully");
    }

    @PostMapping("/{userId}/contact-data")
    public ResponseEntity<?> saveContactData(@RequestBody ContactInfoRequest contactInfoRequest,
                                             @PathVariable String userId) {
        doctorService.saveContactInformation(userId, contactInfoRequest);
        return ResponseEntity.ok("Contact data saved successfully");
    }

    @PostMapping("/{userId}/education-data")
    public ResponseEntity<?> saveEducationData(@RequestBody EducationInfoRequest educationInfoRequest,
                                               @PathVariable String userId) {
        doctorService.saveEducationInformation(userId, educationInfoRequest);
        return ResponseEntity.ok("Education data saved successfully");
    }

    @PostMapping("/{userId}/practice-data")
    public ResponseEntity<?> savePracticeDate(@RequestBody PracticeInfoRequest practiceInfoRequest,
                                              @PathVariable String userId) {
        doctorService.savePracticeInformation(userId, practiceInfoRequest);
        return ResponseEntity.ok("Practice data saved successfully");
    }

    @PostMapping("/{userId}/additional-data")
    public ResponseEntity<?> saveAdditionalData(@RequestBody AdditionalInfoRequest additionalInfoRequest,
                                                @PathVariable String userId) {
        doctorService.saveAdditionalInformation(userId, additionalInfoRequest);
        return ResponseEntity.ok("Practice data saved successfully");
    }
}
