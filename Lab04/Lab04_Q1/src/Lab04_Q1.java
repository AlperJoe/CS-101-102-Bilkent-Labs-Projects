/*
A program that input two values from user(one for ball type and one for
initial meter) and calculates the number of bounces and meters travelled
Alper Bozkurt
02.03.2020
 */

import java.util.Scanner;
public class Lab04_Q1 {
    public static void main(String[] args) {

        //constants
        final int METER_CENTIMETER_TRANSLATOR = 100;
        final double LAST_BOUNCE_LIMIT_CENTIMETER = 10;
        final double COEFFICIENT_OF_TENNIS_BALL = 0.7;
        final double COEFFICIENT_OF_BASKETBALL = 0.75;
        final double COEFFICIENT_OF_SUPERBALL = 0.9;
        final double COEFFICIENT_OF_SOFTBALL = 0.3;

        //variables
        Scanner input1,
                input2;
        String ballType;
        String existingBallType1,
               existingBallType2,
               existingBallType3,
               existingBallType4;
        double initialHeight;
        double initialHeightCentimeter;
        double oldInitialHeightCentimeter;
        int bounceCounter;
        double metersTravelled;
        double newMetersTravelled;

        //two inputs from user
        input1 = new Scanner(System.in);
        input2 = new Scanner(System.in);

        //put the ball types into variables
        existingBallType1 = "Tennis Ball";
        existingBallType2 = "Basketball";
        existingBallType3 = "Superball";
        existingBallType4 = "Softball";

        System.out.print("Enter Ball Type: ");
        ballType = input1.nextLine();

        //if statement to indicate there are for ball types
        if(ballType.equalsIgnoreCase(existingBallType1)
                || ballType.equalsIgnoreCase(existingBallType2)
                || ballType.equalsIgnoreCase(existingBallType3)
                || ballType.equalsIgnoreCase(existingBallType4)) {

            //input must be integer
            System.out.print("Enter initial height(m): ");

            if(input2.hasNextInt()){
                initialHeight = input2.nextInt();
                initialHeightCentimeter = initialHeight * METER_CENTIMETER_TRANSLATOR;

                metersTravelled = 0;
                bounceCounter = 0;

                //while loop to calculate bouncing and meters that the ball travelled
                while(initialHeightCentimeter >= LAST_BOUNCE_LIMIT_CENTIMETER){

                    oldInitialHeightCentimeter = initialHeightCentimeter;

                    if(ballType.equalsIgnoreCase(existingBallType1)){
                        initialHeightCentimeter = oldInitialHeightCentimeter * COEFFICIENT_OF_TENNIS_BALL;
                    }
                    else if(ballType.equalsIgnoreCase(existingBallType2)){
                        initialHeightCentimeter = oldInitialHeightCentimeter * COEFFICIENT_OF_BASKETBALL;
                    }
                    else if(ballType.equalsIgnoreCase(existingBallType3)){
                        initialHeightCentimeter = oldInitialHeightCentimeter * COEFFICIENT_OF_SUPERBALL;
                    }
                    else if(ballType.equalsIgnoreCase(existingBallType4)){
                        initialHeightCentimeter = oldInitialHeightCentimeter * COEFFICIENT_OF_SOFTBALL;
                    }

                    newMetersTravelled = oldInitialHeightCentimeter;

                    if(bounceCounter > 0){
                        newMetersTravelled *= 2;
                    }

                    metersTravelled += newMetersTravelled;

                    bounceCounter ++;
                }

                //print the results
                metersTravelled /= METER_CENTIMETER_TRANSLATOR;
                System.out.println("Number of bounces: " + bounceCounter);
                System.out.printf("Meters travelled: %.2f", metersTravelled );
                System.out.println();
            }
            else{
                System.out.println("Height must be numeric value...");
            }
        }
            else {
            System.out.println("Invalid Ball Type - Exiting...");
        }
    }
}


