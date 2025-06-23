package com.Tutorial10.QuestionTwo;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void print() {
        System.out.println("Name: " + name + ", Surname: " + surname);
    }

    // Optional: toString override for easier printing
    @Override
    public String toString() {
        return name + " " + surname;
    }
}
