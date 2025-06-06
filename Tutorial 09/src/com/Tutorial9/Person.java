package com.Tutorial9;

public class Person {
    private String name;
    private int age;
    private double height;
    private Vehicle[] vehicles = new Vehicle[2];
    private int vehicleCount = 0;

    private static int personCount = 0; // To track total objects


    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
        personCount++;
    }


    public Person() {
        this.name = "Doe";
        this.age = 20;
        this.height = 5.5;
        personCount++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void addVehicles(Vehicle vehicle) {
        if (vehicleCount < 2) {
            vehicles[vehicleCount] = vehicle;
            vehicleCount++;
        } else {
            System.out.println(name + " already owns 2 vehicles.");
        }
    }


    public String getVehicleData() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vehicleCount; i++) {
            sb.append(vehicles[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public static int getPersonCount() {
        return personCount;
    }
}
