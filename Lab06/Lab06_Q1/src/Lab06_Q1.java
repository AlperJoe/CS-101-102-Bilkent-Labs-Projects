/*
Program that determines if a credit card number is valid
or not by using Luhn algorithm
Alper Bozkurt
18.03.2021
 */

import java.util.Scanner;

    public class Lab06_Q1 {

        //calculate the number from reverse
        public static long reverseNumber(long number){
            long reverse;
            reverse = 0;

            while (number != 0){
                reverse = reverse * 10;
                reverse = reverse + number % 10;
                number = number / 10;
            }
            return reverse;
        }

        //count each digits in number
        public static int countDigits(long number){
            int counter;
            counter = 0;

            while(number != 0){
                number = number / 10;
                counter ++;
            }
            return counter;
        }

        //sum of the digits based on the Luhn algorithm
        public static int sumDigits(long number, int length ) {
            int sum;
            int i;
            int digit;

            sum = 0;
            i = 1;
            number = number / 10;
            long reverse = reverseNumber(number);

            while (i <= length) {
                digit = (int) (reverse % 10);

                if (i % 2 != 0) {
                    digit = digit * 2;

                    if (digit > 9) {
                        digit = digit - 9;
                    }
                }
                reverse = reverse / 10;
                sum = sum + digit;
                i++;
            }
            return sum;
        }

        //determine if the card is valid or not by looking if sum is dividable by 10
        public static boolean isValidCard(long creditCardNumber){
            int checkNumber;
            int counter;
            int sum;

            checkNumber = (int)(creditCardNumber % 10);
            counter = countDigits(creditCardNumber);
            sum = sumDigits(creditCardNumber,counter - 1);
            return (sum + checkNumber) % 10 == 0;
        }

        //finding a new valid card number
        public static long generateValidCard(){
            long generatedCreditCardNumber;
            do{
                    generatedCreditCardNumber = 0;
                int digitCount;
                if(Math.random() <= 0.5){
                    digitCount = 15;
                }
                else{
                    digitCount = 16;
                }
                for(int i = 0; i < digitCount; i++){
                    int number = (int) Math.round(Math.random() * 10);
                    generatedCreditCardNumber = (generatedCreditCardNumber * 10) + number;
                }
            }while(!isValidCard(generatedCreditCardNumber));
            return generatedCreditCardNumber;
        }

        //display menu
        public static void displayMenu(){
            System.out.println("------------------MENU------------------");
            System.out.println("1 - Validate Credit Card Number");
            System.out.println("2 - Generate Valid Credit Card Number");
            System.out.println("3 - Exit");
            System.out.print("Enter the choice: ");
        }

        //with combining other methods, reaction to customer according to their input
        public static void main(String[] args){
            int choice;
            do{
                displayMenu();
                Scanner in = new Scanner(System.in);
                choice = in.nextInt();

                if(choice == 1){
                    System.out.print("Enter th credit card number to validate: ");
                    long creditCardNumber= in.nextLong();
                    if(isValidCard(creditCardNumber)){
                        System.out.println("Card number is valid: true");
                    }
                    else{
                        System.out.println("Card number is valid: false");
                    }
                }
                else if(choice == 2){
                    System.out.println("Sample valid credit card:" + generateValidCard());
                }
                else if (choice == 3){
                    System.out.println("Goodbye!");
                }
                else{
                    System.out.println("Invalid choice - try again");
                }
            }while (choice != 3);
        }
    }



