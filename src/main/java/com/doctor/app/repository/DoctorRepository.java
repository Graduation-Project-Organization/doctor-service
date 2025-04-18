package com.doctor.app.repository;

import com.doctor.app.entity.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, Integer> {
    public Doctor findByUserId(String userId);
}