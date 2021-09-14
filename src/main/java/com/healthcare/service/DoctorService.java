package com.healthcare.service;

import com.healthcare.entity.Doctor;

import java.util.List;

public interface DoctorService {

    void createDoctor(Doctor doctor);

    List<Doctor> getAllDoctor();
}





