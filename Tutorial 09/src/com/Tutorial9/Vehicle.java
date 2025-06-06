package com.Tutorial9;

public class Vehicle {
    private String vehicleModel;
    private int vehicleNo;

    public Vehicle(String vehicleModel, int vehicleNo) {
        this.vehicleModel = vehicleModel;
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    @Override
    public String toString() {
        return "Model: " + vehicleModel + ", No: " + vehicleNo;
    }
}
