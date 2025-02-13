
package com.mycompany.mavenproject4;

public class Mavenproject4 {

     // Method to calculate Automobile Tire Pressure
    public static double calculateTirePressure(double m, double T, double V) {
        return 0.37 * m * (T + 460) / V;
    }

    // Method to calculate speed of second pulley
    public static double calculatePulleySpeed(double diameter1, double diameter2, double RPM1) {
        return (diameter1 / diameter2) * RPM1;
    }

    // Method to calculate weight lifted in a multiple pulley system
    public static double calculateWeightLifted(double forceExerted, int numberOfUpRopes) {
        return forceExerted * numberOfUpRopes;
    }

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return (weight / (height * height)) * 703;
    }

    public static void main(String[] args) {
        // Hardcoded values
        double m = 5.0;
        double T = 75.0;
        double V = 2.5;
        System.out.println("Tire Pressure: " + calculateTirePressure(m, T, V) + " psi");

        double diameter1 = 10.0;
        double diameter2 = 5.0;
        double RPM1 = 1500.0;
        System.out.println("RPM of second pulley: " + calculatePulleySpeed(diameter1, diameter2, RPM1));

        double forceExerted = 100.0;
        int numberOfUpRopes = 4;
        System.out.println("Weight Lifted: " + calculateWeightLifted(forceExerted, numberOfUpRopes));

        double weight = 160.0;
        double height = 68.0;
        System.out.println("BMI: " + calculateBMI(weight, height));
    }
}
