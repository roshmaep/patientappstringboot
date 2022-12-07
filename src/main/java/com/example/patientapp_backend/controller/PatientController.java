package com.example.patientapp_backend.controller;

import com.example.patientapp_backend.dao.PatientDao;
import com.example.patientapp_backend.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientController {
    @Autowired
    private PatientDao dao;
    @CrossOrigin(origins = "*")
@PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> PatientAdd(@RequestBody Patients p){
    System.out.println(p.getPid().toString());
    System.out.println(p.getPname().toString());
    System.out.println(p.getAddress().toString());
    System.out.println(p.getMobileno().toString());
    System.out.println(p.getDoap().toString());
    System.out.println(p.getDname().toString());
    dao.save(p);
    HashMap <String,String> map=new HashMap<>();
    map.put("status","success");
    return map;
}
@CrossOrigin(origins = "*")
@GetMapping("/view")
    public List <Patients> PatientView(){
    return(List<Patients>) dao.findAll();
}
}
