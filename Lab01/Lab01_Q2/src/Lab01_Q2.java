/*
 * A simple program to make calculations
 *
 * This program prints information
 * about the answers of three questions
 *
 * @author Alper_Bozkurt
 * @date   09.02.2020
 */

public class Lab01_Q2 {
    public static void main(String[] args) {
        //variables
        double  answer1, answer2, answer3;

        //code
        answer1 = (23.2 - 7.1 / 2.2)/((5.1-3.7)*(3.4+4.2));
        answer2 = ((35.7 * 64.1 - Math.pow(6.0,3))/(43 + Math.pow(5,2)));
        answer3 = Math.pow((2.1 + 8.0),(-1/3.0));

        //print
        System.out.println("Answer1 is: " + answer1);
        System.out.println("Answer2 is: " + answer2);
        System.out.println("Answer3 is: " + answer3);
    }
}
