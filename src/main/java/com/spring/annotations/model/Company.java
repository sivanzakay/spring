package com.spring.annotations.model;

public class Company {

    private String cName;
    private int cId;
    private int cPhoneNumber;
    private String cDescription;

    public Company() {
    }

    public Company(String cName, int cId) {
        this.cName = cName;
        this.cId = cId;
    }

    public Company(String cName, int cId, int cPhoneNumber, String cDescription) {
        this.cName = cName;
        this.cId = cId;
        this.cPhoneNumber = cPhoneNumber;
        this.cDescription = cDescription;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getcPhoneNumber() {
        return cPhoneNumber;
    }

    public void setcPhoneNumber(int cPhoneNumber) {
        this.cPhoneNumber = cPhoneNumber;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }
}
