package com.doctor.app.repository;

import com.doctor.app.entity.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
    public Doctor findByUserId(ObjectId userId);
}