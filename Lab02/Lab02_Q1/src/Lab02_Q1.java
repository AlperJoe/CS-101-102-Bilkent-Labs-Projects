/*
 * A program input a value as milimeter from user
 * calculate and turns into the value to centimeter
 * micrometer and meter
 * @author Alper Bozkurt
 * @date   15.02.2020
 */

import java.util.Scanner;
public class Lab02_Q1 {
    public static void main(String[] args){

        //constants
        final int MICROMETER_TRANSLATOR = 1000;
        final int MILIMETER_TRANSLATOR = 1;
        final double CENTIMETER_TRANSLATOR = 0.1;
        final double METER_TRANSLATOR = 0.001;
        final String doubleDot = ":";

        //variables
        Scanner input;
        double userInput;
        double microMeter;
        double miliMeter;
        double centiMeter;
        double meter;

        //new method to input a value from user
        input = new Scanner(System.in);

        //input a value from user (milimeter)
        System.out.print("Enter measurement in milimeters: ");
        userInput = input.nextDouble();

        //turn to milimeter into micrometer
        microMeter = userInput * MICROMETER_TRANSLATOR;
        System.out.printf("Micrometers %4s %14.3f", doubleDot, microMeter);
        System.out.println();

        //turn to milimeter into milimeter
        miliMeter = userInput * MILIMETER_TRANSLATOR;
        System.out.printf("Milimeters %5s %14.3f ", doubleDot, miliMeter);
        System.out.println();

        //turn to milimeter into centimeter
        centiMeter = userInput * CENTIMETER_TRANSLATOR;
        System.out.printf("Centimeters %4s %14.3f", doubleDot , centiMeter);
        System.out.println();

        //turn to milimeter into meter
        meter = (userInput * METER_TRANSLATOR);
        System.out.printf("Meters %9s %14.3f", doubleDot, meter);
        System.out.println();
    }
}
