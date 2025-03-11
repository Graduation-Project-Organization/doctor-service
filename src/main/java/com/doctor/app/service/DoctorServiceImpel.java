package com.doctor.app.service;


import com.doctor.app.dto.BioInformationRequest;
import com.doctor.app.dto.ContactInformationRequest;
import com.doctor.app.dto.ProfileInformationRequest;
import com.doctor.app.entity.BioInformation;
import com.doctor.app.entity.ContactInformation;
import com.doctor.app.entity.ProfileInformation;
import com.doctor.app.entity.Doctor;
import com.doctor.app.exception.ResourceNotFoundException;
import com.doctor.app.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpel implements DoctorService {
    private final DoctorRepository doctorRepository;

    @Override
    public void saveBioInformation(Integer id, BioInformationRequest bioInformationRequest) {
        try {
            Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
            if (doctor.getBioInformation() == null) {
                doctor.setBioInformation(new BioInformation());
            }
            doctor.getBioInformation().setFirstName(bioInformationRequest.getFirstName());
            doctor.getBioInformation().setMiddleName(bioInformationRequest.getMiddleName());
            doctor.getBioInformation().setLastName(bioInformationRequest.getLastName());
            doctor.getBioInformation().setGender(bioInformationRequest.getGender());
            doctor.getBioInformation().setDateOfBirth(bioInformationRequest.getDateOfBirth());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving bio information");
        }
    }

    @Override
    public void saveProfileInformation(Integer id, ProfileInformationRequest profileInformationRequest) {
        try {
            Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
            if (doctor.getProfileInformation() == null) {
                doctor.setProfileInformation(new ProfileInformation());
            }
            doctor.getProfileInformation().setMedicalLicense(profileInformationRequest.getMedicalLicense());
            doctor.getProfileInformation().setYearsOfExperience(profileInformationRequest.getYearsOfExperience());
            doctor.getProfileInformation().setMedicalLicenseExpiryDate(profileInformationRequest.getMedicalLicenseExpiryDate());
            doctor.getProfileInformation().setBiography(profileInformationRequest.getBiography());
            doctor.getProfileInformation().setProfileImage(profileInformationRequest.getProfileImage().getBytes());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving profile information");
        }
    }

    @Override
    public void saveContactInformation(Integer id, ContactInformationRequest contactInformationRequest) {
        try {
            Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
            if (doctor.getContactInformation() == null) {
                doctor.setContactInformation(new ContactInformation());
            }
            doctor.getContactInformation().setEmail(contactInformationRequest.getEmail());
            doctor.getContactInformation().setPhoneNumber(contactInformationRequest.getPhoneNumber());
            doctor.getContactInformation().setCountry(contactInformationRequest.getCountry());
            doctor.getContactInformation().setCity(contactInformationRequest.getCity());
            doctor.getContactInformation().setState(contactInformationRequest.getState());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving contact information");
        }
    }
}
