/*
Program that inputs a string and an integer value,
n, from user and output an appropriate message
if the first and last n character of the string
are the same
Alper Bozkurt
25.02.2021
 */

import java.util.Scanner;
public class Lab03_Q3 {
    public static void main(String[] args) {

        //variables
        Scanner input;
        String sentence;
        int lengthOfSentence;
        int numberFromUser;
        String sub1,
               sub2;

        //two input from user
        input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sentence = input.next();

        //finding length of sentence to
        lengthOfSentence = sentence.length();

        //eleminate the unalphabetical character in the end of the string
        if(!Character.isLetter(sentence.charAt(lengthOfSentence - 1))){
            lengthOfSentence --;
        }

        System.out.print("Enter an integer value between 1 and " + lengthOfSentence + ": " );

        if(input.hasNextInt()) {

            //it is behind the hasNextInt because we indicate condition firstly then expression
            numberFromUser = input.nextInt();

            if (numberFromUser >= 1 && numberFromUser <= lengthOfSentence) {

                //two substring variable to separate the string
            sub1 = sentence.substring(0, numberFromUser);
            sub2 = sentence.substring(lengthOfSentence - numberFromUser, lengthOfSentence);

            //condition of numbers that user must input

                //condition to print if first and last n values are equal
                if (sub1.equals(sub2)) {
                    System.out.print("First and last " + numberFromUser);
                    System.out.println(" characters are the same");
                }
                else {
                    System.out.print("First and last " + numberFromUser);
                    System.out.println(" characters are not the same");
                }
            }
            //invalid integer message
            else {
                System.out.println("Error - value must be between 1 and " + lengthOfSentence);
            }
        }
        //invalid number message
        else{
            System.out.println("Error - value must be an integer");
        }
    }
}

