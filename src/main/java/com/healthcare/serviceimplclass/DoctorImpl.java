package com.healthcare.serviceimplclass;

import com.healthcare.entity.Doctor;
import com.healthcare.repository.DoctorRepository;
import com.healthcare.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorImpl implements DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public void createDoctor(Doctor doctor) {
        doctorRepository.save(doctor);

    }

    @Override
    public List<Doctor> getAllDoctor() {
        List<Doctor>doctors=doctorRepository.findAll();
        return doctors;
    }
}
