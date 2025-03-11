package com.doctor.app.service;

import com.doctor.app.dto.BioInformationRequest;
import com.doctor.app.dto.ContactInformationRequest;
import com.doctor.app.dto.ProfileInformationRequest;

public interface DoctorService {
    void saveBioInformation(Integer id, BioInformationRequest bioInformationRequest);

    void saveProfileInformation(Integer id, ProfileInformationRequest profileInformationRequest);

    void saveContactInformation(Integer id, ContactInformationRequest contactInformationRequest);
}
