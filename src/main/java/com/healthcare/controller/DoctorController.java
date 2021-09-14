package com.healthcare.controller;

import com.healthcare.entity.Doctor;
import com.healthcare.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/doc")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @GetMapping("/display")
    public String getDoctor(){
        return "DoctorPage";
    }
    @PostMapping("/saveDoctor")
    public String createDoctor(@ModelAttribute Doctor doctor, Model model){
        doctorService.createDoctor(doctor);
        String msg="data created successfully";
        model.addAttribute("msg",msg);
          List<Doctor> list=doctorService.getAllDoctor();
       model.addAttribute("list",list);
        return "InsertDoctor";


    }
    @GetMapping("/getAllDoctor")
    public String getAllDoctor(Model model){
       List<Doctor>list= doctorService.getAllDoctor();
       model.addAttribute("list",list);
        return "InsertDoctor";
    }



}
