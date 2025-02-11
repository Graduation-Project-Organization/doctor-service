package com.doctor.app.service;

import com.doctor.app.entity.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {
    public List<Doctor> getDoctors();
    public Optional<Doctor> getDoctor(int id);
    public Optional<Doctor> addDoctor(Doctor doctor);
    public Optional<Doctor> updateDoctor(Doctor doctor);
    public void deleteDoctor(int id);
}
