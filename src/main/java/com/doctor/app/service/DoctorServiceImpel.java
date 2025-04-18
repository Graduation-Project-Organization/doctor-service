package com.doctor.app.service;

import com.doctor.app.dto.*;
import com.doctor.app.entity.*;
import com.doctor.app.exception.ResourceNotFoundException;
import com.doctor.app.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.print.Doc;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpel implements DoctorService {
    private final DoctorRepository doctorRepository;

    @Override
    public void saveBioInformation(String userId, BioInfoRequest bioInfoRequest) {
        try {
            Doctor doctor = doctorRepository.findByUserId(userId);
            doctor.setFirstName(bioInfoRequest.getFirstName());
            doctor.setMiddleName(bioInfoRequest.getMiddleName());
            doctor.setLastName(bioInfoRequest.getLastName());
            doctor.setGender(bioInfoRequest.getGender());
            doctor.setDateOfBirth(bioInfoRequest.getDateOfBirth());
            System.out.println(bioInfoRequest.getDateOfBirth());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving bio information");
        }
    }

    @Override
    public void saveProfileInformation(String userId, ProfileInfoRequest profileInformationRequest) {
        try {
            Doctor doctor = doctorRepository.findByUserId(userId);
            doctor.setMedicalLicense(profileInformationRequest.getMedicalLicense());
            doctor.setYearsOfExperience(profileInformationRequest.getYearsOfExperience());
            doctor.setMedicalLicenseExpiryDate(profileInformationRequest.getMedicalLicenseExpiryDate());
            doctor.setBiography(profileInformationRequest.getBiography());
            doctor.setProfileImage(profileInformationRequest.getProfileImage().getBytes());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving profile information");
        }
    }

    @Override
    public void saveContactInformation(String userId, ContactInfoRequest contactInfoRequest) {
        try {
            Doctor doctor = doctorRepository.findByUserId(userId);
            doctor.setEmail(contactInfoRequest.getEmail());
            doctor.setPhoneNumber(contactInfoRequest.getPhoneNumber());
            doctor.setCountry(contactInfoRequest.getCountry());
            doctor.setCity(contactInfoRequest.getCity());
            doctor.setState(contactInfoRequest.getState());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving contact information");
        }
    }

    @Override
    public void saveEducationInformation(String userId, EducationInfoRequest educationInfoRequest) {
        try {
            Doctor doctor = doctorRepository.findByUserId(userId);
            doctor.setSchoolName(educationInfoRequest.getSchoolName());
            doctor.setGraduationYear(educationInfoRequest.getGraduationYear());
            doctor.setSpecialization(educationInfoRequest.getSpecialization());
            doctor.setSpecialities(educationInfoRequest.getSpecialities());
            doctor.setProfileImage(educationInfoRequest.getProfileImage().getBytes());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving education information");
        }
    }

    @Override
    public void savePracticeInformation(String userId, PracticeInfoRequest practiceInfoRequest) {
        try {
            Doctor doctor = doctorRepository.findByUserId(userId);
            doctor.setHospitalName(practiceInfoRequest.getHospitalName());
            doctor.setHourlyCharge(practiceInfoRequest.getHourlyCharge());
            doctor.setHospitalAddress(practiceInfoRequest.getHospitalAddress());
            doctor.setHospitalContactNumber(practiceInfoRequest.getHospitalContactNumber());
            doctor.setHospitalEmail(practiceInfoRequest.getHospitalEmail());
            doctor.setHospitalWebsite(practiceInfoRequest.getHospitalWebsite());
            doctor.setHospitalHoursOfOperation(practiceInfoRequest.getHospitalHoursOfOperation());
            doctor.setInsurance(practiceInfoRequest.isInsurance());
            doctor.setHospitalServices(practiceInfoRequest.getHospitalServices());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving practice information");
        }
    }

    @Override
    public void saveAdditionalInformation(String userId, AdditionalInfoRequest additionalInfoRequest) {
        try {
            Doctor doctor = doctorRepository.findByUserId(userId);
            doctor.setEducationHistory(additionalInfoRequest.getEducationHistory());
            doctor.setResearch(additionalInfoRequest.getResearch());
            doctor.setAwards(additionalInfoRequest.getAwards());
            doctor.setAdditionalDocument(additionalInfoRequest.getAdditionalDocument().getBytes());
            doctorRepository.save(doctor);
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("An error occurred while saving additional information");
        }
    }
}
