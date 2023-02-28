/*
Alper Bozkurt
CS 101 Lab 1 Question 3 
 */
public class Lab01_Q3 {
    public static void main(String[] args) {

        //constants
        long AREA_OF_WORLD = 510072000;
        double PERCANTAGE_OF_DRYLAND = 0.292;
        long TOTAL_AREA_OF_TURKEY = 783562;
        double SEA_PERCENTAGE_OF_TURKEY = 0.013;

        //variables
        long dryLandWorld;
        long waterWorld;
        long waterTurkey;
        long dryLandTurkey;
        double dryPercentageTurkey;
        double waterPercentageTurkey;

        //How much of the area of the world is dry land and how much is water?
        dryLandWorld =(long)(AREA_OF_WORLD * PERCANTAGE_OF_DRYLAND);
        waterWorld = AREA_OF_WORLD - dryLandWorld;

        //How much of the area in Turkey is dry land and how much is water?
        waterTurkey =(long) (TOTAL_AREA_OF_TURKEY * SEA_PERCENTAGE_OF_TURKEY);
        dryLandTurkey = TOTAL_AREA_OF_TURKEY - waterTurkey;

        //What percent of the whole dry land of earth is in Turkey?
        dryPercentageTurkey =(double) dryLandTurkey / dryLandWorld * 100;

        //What percent of all water is in Turkey?
        waterPercentageTurkey =(double) waterTurkey / waterWorld * 100;

        //Print results
        System.out.println("Earth has " + dryLandWorld +  "km2 dry land and " + waterWorld + "km2 water.");
        System.out.println( "Turkey has " + dryLandTurkey + "km2 dry land and " + waterTurkey + "km2 water.");
        System.out.println("Turkey has " + dryPercentageTurkey + " percent of the Earth's dry land.");
        System.out.println("And " + waterPercentageTurkey + " percent of the Earth's water.");
    }
}
