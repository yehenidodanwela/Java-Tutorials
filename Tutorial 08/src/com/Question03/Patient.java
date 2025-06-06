package com.Question03;

public class Patient {
    private String patientID;
    private String name;
    private int age;
    private String gender;
    private String phoneNumber;

    public Patient(String patientID, String name, int age, String gender, String phoneNumber) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getPatientID() {
        return patientID;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientID + ", Name: " + name + ", Age: " + age +
                ", Gender: " + gender + ", Phone: " + phoneNumber;
    }
}
