/*
A program that input a string and sum all digits in the string
Alper Bozkurt
10.03.2021
 */
import java.util.Scanner;

public class Lab05_Q1a {
    public static void main(String[] args) {

        //constants
        final int figureMin = 48;
        final int figureMax = 57;

        //variables
        Scanner input;
        String sentence;
        int sum;
        boolean bool;

        //input from user
        input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();

        //starting condition for the loop
        bool = true;
        sum = 0;

        //for loop meeting i with other characters one by one
        for (int i = 0; i < sentence.length(); i++) {

            //if ascii decimal point is between 48 and 57, it is a
            if (sentence.charAt(i) <= figureMax && sentence.charAt(i) >= figureMin) {
                //because it 48 is 0 and 49 is 1 so figureMin must be extracted
                sum = sentence.charAt(i) - figureMin + sum;
                bool = false;
            }
        }
        //detection if there is a numeric character in the sentence
        if (bool) {
            System.out.println("No numeric characters exist in the input string");
        }
        else {
            System.out.println("The sum of the digits is: " + sum);
        }
    }
}

