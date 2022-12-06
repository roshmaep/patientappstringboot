package com.example.patientapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patients")
public class Patients {
    @Id
    @GeneratedValue
    private int id;
    private String pid;
    private String pname;
    private String address;
    private String mobileno;
    private String doap;
    private String dname;

    public Patients() {
    }

    public Patients(int id, String pid, String pname, String address, String mobileno, String doap, String dname) {
        this.id = id;
        this.pid = pid;
        this.pname = pname;
        this.address = address;
        this.mobileno = mobileno;
        this.doap = doap;
        this.dname = dname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getDoap() {
        return doap;
    }

    public void setDoap(String doap) {
        this.doap = doap;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
