/*
A program that calculates the sine of an input
value x(radians) with n value for more precise result
Alper Bozkurt
02.03.2021
 */
import java.util.Scanner;
public class Lab04_Q2 {
    public static void main(String[] args) {

        //variables
        Scanner input;
        double radian;
        int n;
        int counter;
        double theorem;
        double newTheorem;
        int multiplier;

        //input from user
        input = new Scanner(System.in);

        System.out.print("Enter x: ");
        radian = input.nextDouble();

        System.out.print("Enter n: ");
        n = input.nextInt();

        //calculate radian
        System.out.println(radian);
        radian = radian % (Math.PI * 2);
        System.out.println(radian);
        System.out.println();
        //because of undefined result, counter starts with 2
        //and loop starting with x
        counter = 2;
        newTheorem = radian;

        //define theorem
        theorem = newTheorem;

        //loop for calculating new values and add to sum of old values
        while( counter <= n ){
            multiplier  = 2 * counter - 1;
            newTheorem = -Math.pow(radian, 2) / (multiplier * (multiplier - 1)) * newTheorem;
            theorem += newTheorem;
            counter++;
        }
        //print the result
        System.out.println(theorem);
    }
}
