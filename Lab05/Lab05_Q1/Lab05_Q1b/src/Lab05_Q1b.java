/*
A program that displays each three-digit narcissistic number and their sum
Alper Bozkurt
10.03.2021
 */

public class Lab05_Q1b {
    public static void main(String[] args) {

        //variables
        int sumOfCubes;
        int digit1;
        int digit2;
        int digit3;
        int sum;

        //condition before the loop
        sum = 0;

        //i meet all numbers between 100 and 1000 to detect which number is narcissistic
        for(int i = 100; i < 1000; i++) {

            //separation of three-digit number to three figures
            digit1 = i % 10;
            digit2 = i / 10;
            digit2 = digit2 % 10;
            digit3 = i / 100;
            digit3 = digit3 % 10;

            //sum of cubes of three figures of three digit number
            sumOfCubes = (int) Math.pow(digit1, 3) + (int) Math.pow(digit2, 3) + (int) Math.pow(digit3, 3);

            //detection if the number is narcissistic and print, sum the narcissistic numbers
            if (sumOfCubes == i) {
                System.out.println(i + " is a narcissistic number");
                sum += i;
            }
        }
        //print sum of narcissistic numbers
        System.out.println("Sum of three-digit narcissistic numbers: " + sum);
    }
}
