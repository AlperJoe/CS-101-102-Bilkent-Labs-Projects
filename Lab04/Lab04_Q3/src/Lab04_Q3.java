/*
A program that determines if a word input by the
user is a pair-word
Alper Bozkurt
03.03.2020
 */
import java.util.Scanner;
public class Lab04_Q3 {
    public static void main(String[] args) {

        //variables
        Scanner input;
        String word;
        boolean bool;
        int counter;
        int i,
            j;

        //input from user
        input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        word = input.next();
        word = word.toLowerCase();
        bool = true;
        i = 0;

        //while loop to vary i to compare with j
        while (i < word.length()) {

            j = 0;
            counter = 0;

            //while loop to vary j to compare with i
            while (j < word.length()) {

                if (word.charAt(i) == word.charAt(j)) {
                    counter++;
                    System.out.println(word.charAt(i) + " " + word.charAt(j) +" "+ counter);
                }
                j ++;
            }
            if (counter != 2) {
                bool = false;
            }
            i ++;
        }
        //if statement to indicate if it is pair or not
        if (bool) {
            System.out.println(word + " is a pair-word!");
        }
        else {
            System.out.println(word + " is not a pair-word!");
        }
    }
}
