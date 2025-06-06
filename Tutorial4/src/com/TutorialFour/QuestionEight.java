package com.TutorialFour;

import java.util.Random;

public class QuestionEight {
    public static void main(String[] args) {
        int simulations = 1000;
        Random generator = new Random();

        int[] xRolls = new int[simulations];
        int[] yRolls = new int[simulations];

        int countX4 = 0;
        int countY4 = 0;
        int countBoth4 = 0;

        for (int i = 0; i < simulations; i++) {
            xRolls[i] = generator.nextInt(6) + 1;
            yRolls[i] = generator.nextInt(6) + 1;

            if (xRolls[i] == 4) countX4++;
            if (yRolls[i] == 4) countY4++;
            if (xRolls[i] == 4 && yRolls[i] == 4) countBoth4++;
        }

        double probX4 = (double) countX4 / simulations;
        double probY4 = (double) countY4 / simulations;
        double probBoth4 = (double) countBoth4 / simulations;

        System.out.println("Simulated " + simulations + " dice rolls with arrays:");
        System.out.println("Estimated P(X = 4): " + probX4);
        System.out.println("Estimated P(Y = 4): " + probY4);
        System.out.println("Estimated P(X = 4 and Y = 4): " + probBoth4);

        System.out.println("\nX Rolls:");
        for (int i = 0; i < simulations; i++) {
            System.out.print(xRolls[i] + " ");
        }

        System.out.println("\n\nY Rolls:");
        for (int i = 0; i < simulations; i++) {
            System.out.print(yRolls[i] + " ");
        }

        System.out.println();
    }
}
