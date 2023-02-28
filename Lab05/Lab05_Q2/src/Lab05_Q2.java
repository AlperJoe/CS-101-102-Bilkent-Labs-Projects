/*
A program that inputs a nucleic acid sequence and displays
its encoded form
Alper Bozkurt
11.03.2021
*/

import java.util.Scanner;
public class Lab05_Q2 {
    public static void main(String[] args) {

        //variables
        Scanner input;
        String sequence;
        char old,
             current;
        int counter;
        String result;

        //input from user
        input = new Scanner(System.in);
        System.out.print("Enter a nucleic acid sequence: ");
        sequence = input.nextLine();

        //starting conditions before for loop
        old = sequence.charAt(0);
        counter = 0;
        result = "";

        //for loop to meet i with other characters
        for(int i = 0; i < sequence.length(); i++){
            current = sequence.charAt(i);
            //if there is character streaks
            if(old == current){
                counter ++;
            }
            //if the character changes
            else{
                result = result + old + counter;
                counter = 1;
            }
            //make the old new old
            old = current;

        }
        //last result to include the last character
        result = result + old + counter;

        //print result
        System.out.println("Encoded Sequence: " + result);
    }
}
