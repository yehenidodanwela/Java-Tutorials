package com.Tutorial10.QuestionFour;

import java.util.LinkedList;

public class Inventory {
    private LinkedList<TomatoBox> tomatoBoxes = new LinkedList<>();
    private LinkedList<CarrotBox> carrotBoxes = new LinkedList<>();

    public void addTomatoBox(String date) {
        tomatoBoxes.add(new TomatoBox(date));
        System.out.println("Tomato box added.");
    }

    public void addCarrotBox(String date) {
        carrotBoxes.add(new CarrotBox(date));
        System.out.println("Carrot box added.");
    }

    public void sellTomatoBox() {
        if (tomatoBoxes.isEmpty()) {
            System.out.println("No tomato boxes to sell.");
        } else {
            TomatoBox sold = tomatoBoxes.removeFirst();
            System.out.println("Sold tomato box with best before: " + sold.getBestBeforeDate());
        }
    }

    public void sellCarrotBox() {
        if (carrotBoxes.isEmpty()) {
            System.out.println("No carrot boxes to sell.");
        } else {
            CarrotBox sold = carrotBoxes.removeFirst();
            System.out.println("Sold carrot box with best before: " + sold.getBestBeforeDate());
        }
    }

    public void printInventory() {
        System.out.println("\nInventory:");
        System.out.println("Tomato Boxes: " + tomatoBoxes.size());
        for (TomatoBox t : tomatoBoxes) {
            t.printBox();
        }

        System.out.println("Carrot Boxes: " + carrotBoxes.size());
        for (CarrotBox c : carrotBoxes) {
            c.printBox();
        }
    }
}
