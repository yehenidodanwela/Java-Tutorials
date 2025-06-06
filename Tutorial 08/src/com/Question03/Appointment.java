package com.Question03;

public class Appointment {
    private String appointmentID;
    private Patient patient;
    private String doctorName;
    private String date;
    private String time;
    private String reason;

    public Appointment(String appointmentID, Patient patient, String doctorName, String date, String time, String reason) {
        this.appointmentID = appointmentID;
        this.patient = patient;
        this.doctorName = doctorName;
        this.date = date;
        this.time = time;
        this.reason = reason;
    }

    public String getAppointmentID() {
        return appointmentID;
    }
    public Patient getPatient() {
        return patient;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public String getReason() {
        return reason;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentID + ", Date: " + date + ", Time: " + time +
                "\nDoctor: " + doctorName + "\nPatient: " + patient.getName() +
                "\nReason: " + reason;
    }
}
