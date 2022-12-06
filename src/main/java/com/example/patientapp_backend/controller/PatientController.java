package com.example.patientapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
@PostMapping("/add")
    public String PatientAdd(){
    return "patient added successfully";
}
@GetMapping("/view")
    public String PatientView(){
    return "patient view";
}
}
