package com.Tutorial9;

public class Driver {
    public static void main(String[] args) {
        // Step 1 & 5 - Create Person objects
        Person anne = new Person("Anne", 24, 5.3);
        Person john = new Person("John", 21, 5.8);
        Person paul = new Person("Paul", 23, 5.6);
        Person defaultPerson = new Person(); // Doe

        // Step 6 - Create Vehicles
        Vehicle benz = new Vehicle("Benz", 1234);
        Vehicle toyota = new Vehicle("Toyota", 5647);
        Vehicle nissan = new Vehicle("Nissan", 1456);

        // Step 7 - Add vehicles to persons
        anne.addVehicles(benz);
        john.addVehicles(nissan);
        john.addVehicles(toyota);

        // Step 8 - Display vehicle count owned by Anne
        System.out.println("Anne owns " + anne.getVehicleCount() + " vehicle(s).");

        // Step 9 - Display names of vehicles owned by John
        System.out.println("Vehicles owned by John:");
        System.out.println(john.getVehicleData());

        // Step 10 - Create an array of 5 new vehicles
        Vehicle[] vehicleArray = new Vehicle[5];
        vehicleArray[0] = new Vehicle("Mazda", 3344);
        vehicleArray[1] = new Vehicle("Ford", 7788);
        vehicleArray[2] = new Vehicle("BMW", 8888);
        vehicleArray[3] = new Vehicle("Kia", 4567);
        vehicleArray[4] = new Vehicle("Honda", 1222);

        // Display all 5 vehicles in the array
        System.out.println("Five vehicle objects in the array:");
        for (Vehicle v : vehicleArray) {
            System.out.println(v);
        }

        // Show how many person objects were created
        System.out.println("Total person objects created: " + Person.getPersonCount());

    }
}
