/*
A program that inputs a minimum and maximum number of people
and displays the probabilities.
Alper Bozkurt
12.03.2021
 */
import java.util.Scanner;
public class Lab05_Q3 {
    public static void main(String[] args) {

        //constants
        final double D = 365;

        //variables
        Scanner input;
        int minPeople;
        int maxPeople;
        double formula;
        double addition;

        input = new Scanner(System.in);

        //while do because first pass might be happening without having a loop
        do{
            //two input from user
            System.out.print("Enter the minimum and maximum number of people: ");
            minPeople = input.nextInt();
            maxPeople = input.nextInt();

            //error message if min number people is bigger or equal than max num. people
            if(minPeople >= maxPeople){
                System.out.println("error");
            }
        }while(minPeople >= maxPeople);

        //print table with using printf method
        System.out.printf("NUMBER OF PEOPLE %13s", "PROBABILITY");
        System.out.println();
        //starting condition before for loop
        formula = 1;

        //for loop to find probabilities from min to max
        for(int i = 0; i < maxPeople; i ++ ){

            //while loop to the min
            while(i < minPeople - 1 ){

                //addition multiply result every time and make new result
                addition  = (D - i)/D;
                formula *= addition;
                i ++;
            }
            //from min to max
            addition  = (D - i)/D;
            formula *= addition;
            System.out.printf(i + 1  + "%22.3f" , (1.0 - formula));
            System.out.println();
        }
    }
}
