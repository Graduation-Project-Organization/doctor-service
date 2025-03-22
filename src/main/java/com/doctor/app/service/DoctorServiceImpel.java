package com.doctor.app.service;


import com.doctor.app.dto.*;
import com.doctor.app.entity.*;
import com.doctor.app.exception.ResourceNotFoundException;
import com.doctor.app.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpel implements DoctorService {
    private final DoctorRepository doctorRepository;

    @Override
    public void saveBioInformation(Integer id, BioInfoRequest bioInfoRequest) {
        try {
            Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
            if (doctor.getBioInformation() == null) {
                doctor.setBioInformation(new BioInformation());
            }
            doctor.getBioInformation().setFirstName(bioInfoRequest.getFirstName());
            doctor.getBioInformation().setMiddleName(bioInfoRequest.getMiddleName());
            doctor.getBioInformation().setLastName(bioInfoRequest.getLastName());
            doctor.getBioInformation().setGender(bioInfoRequest.getGender());
            doctor.getBioInformation().setDateOfBirth(bioInfoRequest.getDateOfBirth());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving bio information");
        }
    }

    @Override
    public void saveProfileInformation(Integer id, ProfileInfoRequest profileInformationRequest) {
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
    public void saveContactInformation(Integer id, ContactInfoRequest contactInfoRequest) {
        try {
            Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
            if (doctor.getContactInformation() == null) {
                doctor.setContactInformation(new ContactInformation());
            }
            doctor.getContactInformation().setEmail(contactInfoRequest.getEmail());
            doctor.getContactInformation().setPhoneNumber(contactInfoRequest.getPhoneNumber());
            doctor.getContactInformation().setCountry(contactInfoRequest.getCountry());
            doctor.getContactInformation().setCity(contactInfoRequest.getCity());
            doctor.getContactInformation().setState(contactInfoRequest.getState());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving contact information");
        }
    }

    @Override
    public void saveEducationInformation(Integer id, EducationInfoRequest educationInfoRequest) {
        try {
            Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
            if (doctor.getEducationInformation() == null) {
                doctor.setEducationInformation(new EducationInformation());
            }
            doctor.getEducationInformation().setSchoolName(educationInfoRequest.getSchoolName());
            doctor.getEducationInformation().setGraduationYear(educationInfoRequest.getGraduationYear());
            doctor.getEducationInformation().setSpecialization(educationInfoRequest.getSpecialization());
            doctor.getEducationInformation().setSpecialities(educationInfoRequest.getSpecialities());
            doctor.getEducationInformation().setProfileImage(educationInfoRequest.getProfileImage().getBytes());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving education information");
        }
    }

    @Override
    public void savePracticeInformation(Integer id, PracticeInfoRequest practiceInfoRequest) {
        try {
            Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
            if (doctor.getPracticeInformation() == null) {
                doctor.setPracticeInformation(new PracticeInformation());
            }
            doctor.getPracticeInformation().setHospitalName(practiceInfoRequest.getHospitalName());
            doctor.getPracticeInformation().setHourlyCharge(practiceInfoRequest.getHourlyCharge());
            doctor.getPracticeInformation().setHospitalAddress(practiceInfoRequest.getHospitalAddress());
            doctor.getPracticeInformation().setHospitalContactNumber(practiceInfoRequest.getHospitalContactNumber());
            doctor.getPracticeInformation().setHospitalEmail(practiceInfoRequest.getHospitalEmail());
            doctor.getPracticeInformation().setHospitalWebsite(practiceInfoRequest.getHospitalWebsite());
            doctor.getPracticeInformation().setHospitalHoursOfOperation(practiceInfoRequest.getHospitalHoursOfOperation());
            doctor.getPracticeInformation().setInsurance(practiceInfoRequest.isInsurance());
            doctor.getPracticeInformation().setHospitalServices(practiceInfoRequest.getHospitalServices());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving practice information");
        }
    }

    @Override
    public void saveAdditionalInformation(Integer id, AdditionalInfoRequest additionalInfoRequest) {
        try {
            Doctor doctor = doctorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Doctor not found"));
            if (doctor.getAdditionalInformation() == null) {
                doctor.setAdditionalInformation(new AdditionalInformation());
            }
            doctor.getAdditionalInformation().setEducationHistory(additionalInfoRequest.getEducationHistory());
            doctor.getAdditionalInformation().setResearch(additionalInfoRequest.getResearch());
            doctor.getAdditionalInformation().setAwards(additionalInfoRequest.getAwards());
            doctor.getAdditionalInformation().setAdditionalDocument(additionalInfoRequest.getAdditionalDocument().getBytes());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving additional information");
        }
    }
}
