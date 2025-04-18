package com.doctor.app.service;

import com.doctor.app.dto.*;

public interface DoctorService {
    void saveBioInformation(String userId, BioInfoRequest bioInfoRequest);

    void saveProfileInformation(String userId, ProfileInfoRequest profileInformationRequest);

    void saveContactInformation(String userId, ContactInfoRequest contactInfoRequest);

    void saveEducationInformation(String userId, EducationInfoRequest educationInfoRequest);

    void savePracticeInformation(String userId, PracticeInfoRequest practiceInfoRequest);

    void saveAdditionalInformation(String userId, AdditionalInfoRequest additionalInfoRequest);
}
