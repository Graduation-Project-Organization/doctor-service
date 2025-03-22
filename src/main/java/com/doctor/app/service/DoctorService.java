package com.doctor.app.service;

import com.doctor.app.dto.*;

public interface DoctorService {
    void saveBioInformation(Integer id, BioInfoRequest bioInfoRequest);

    void saveProfileInformation(Integer id, ProfileInfoRequest profileInformationRequest);

    void saveContactInformation(Integer id, ContactInfoRequest contactInfoRequest);

    void saveEducationInformation(Integer id, EducationInfoRequest educationInfoRequest);

    void savePracticeInformation(Integer id, PracticeInfoRequest practiceInfoRequest);

    void saveAdditionalInformation(Integer id, AdditionalInfoRequest additionalInfoRequest);
}
