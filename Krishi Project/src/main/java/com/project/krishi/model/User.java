package com.project.krishi.model;
import jakarta.persistence.*;



@Entity



public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    private Name name;
    private String phoneNumber;
    private String email;
    private String address;
    private String password;
    private UserType userType;

    public User() {
    }

    public void setName(String firstName, String lastName) {
        this.name = new Name(firstName, lastName);
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;

    }
    public String getPassword() {
        return password;
    }
    public UserType getUserType() {
        return userType;
    }
    public String getFullName() {
        return  name.getLastName() + " " + name.getFirstName();
    }
}
