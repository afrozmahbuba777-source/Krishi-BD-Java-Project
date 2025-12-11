package com.project.krishi.model;

import jakarta.persistence.*;


@Entity
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;


    @OneToOne(cascade = CascadeType.ALL)

    private Name name;
    private String phoneNumber;
    private String address;
    private String gender;
    private String trainingType;
    private String additionalDetails;
    private UserType userType;


    public Trainee() {
    }

    public Trainee(int id, Name name, String phoneNumber, String address, String gender, String trainingType, String additionalDetails, UserType userType) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.trainingType = trainingType;
        this.additionalDetails = additionalDetails;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setName(String firstName, String lastName) {
        this.name = new Name(firstName, lastName);
    }
    }

