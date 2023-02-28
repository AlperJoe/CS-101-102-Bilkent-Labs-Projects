/*
A program calculates and displays the rounded
sum of 2 values input by the user
Alper Bozkurt
22.02.2020
 */

import java.util.Scanner;
public class Lab03_Q1 {
    public static void main(String[] args) {

        //constants
        final int ROUND_ADDER = 5;
        final int FLOAT_TRANSLATOR = 10;

        //variables
        Scanner input;
        int inputNumber1,
            inputNumber2;
        int roundedNumber1,
            roundedNumber2;
        int result;

        //input two values from user
        input = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        inputNumber1 = input.nextInt();
        inputNumber2 = input.nextInt();

        //numbers that will achieve twenty are 15, 16, 17, 18, 19, 20, 21, 22, 23, 24
        //with adding five we make the decimal place of all the numbers 2
        //then with using the float translator all the numbers become twenty
        roundedNumber1 = ((inputNumber1 + ROUND_ADDER) / FLOAT_TRANSLATOR) * FLOAT_TRANSLATOR;

        //affect the next number if rounded to three
        if (roundedNumber1 % 3 == 0) {
            roundedNumber2 = inputNumber2;
        }
        else {
            roundedNumber2 = ((inputNumber2 + 5) / 10) * 10;
        }
        result = roundedNumber1 + roundedNumber2;

        //print the result
        System.out.print("The sum of the rounded values of the " + inputNumber1);
        System.out.print( " and " + inputNumber2 + ": " + result);
    }
}


