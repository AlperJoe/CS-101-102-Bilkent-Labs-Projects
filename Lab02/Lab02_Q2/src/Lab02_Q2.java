/*
 * A program inputs the monthly salary from the user
 * and calculates and displays the table
 * @author Alper Bozkurt
 * @date   16.02.2020
 */
import java.util.Scanner;
public class Lab02_Q2 {
    public static void main( String[] args ) {

        //constants
        final double HOUSING_PERCENTAGE = 0.3;
        final double FOOD_PERCENTAGE = 0.15;
        final double TRANSPORT_PERCENTAGE = 0.2;
        final double SAVINGS_PERCENTAGE = 0.18;
        final String LOTS_OF_MINUS;
        LOTS_OF_MINUS = "---------------------------------------------------";
        final String THIRTY_PERCENT = "%30",
                     FIFTEEN_PERCENT = "%15",
                     TWENTY_PERCENT = "%20",
                     EIGHTEEN_PERCENT = "%18";

        //variables
        Scanner input;
        int salary;
        double housing;
        double food;
        double transport;
        double savings;
        double total;
        double remaining;

        //input from user
        input = new Scanner(System.in);
        System.out.print("Enter monthly salary: ");
        salary = input.nextInt();

        //calculations
        housing = HOUSING_PERCENTAGE * salary;
        food = FOOD_PERCENTAGE * salary;
        transport = TRANSPORT_PERCENTAGE * salary;
        savings = SAVINGS_PERCENTAGE * salary;
        total = housing + food + transport + savings;
        remaining = salary - total;

        //print the intended results
        System.out.println( LOTS_OF_MINUS );
        System.out.printf("|Housing %15s %24.2f %1s", THIRTY_PERCENT, housing, "|");
        System.out.println();
        System.out.printf("|Food %18s %24.2f %1s", FIFTEEN_PERCENT, food, "|");
        System.out.println();
        System.out.printf("|Transport %13s %24.2f %1s", TWENTY_PERCENT, transport, "|");
        System.out.println();
        System.out.printf("|Savings %15s %24.2f %1s", EIGHTEEN_PERCENT, savings, "|");
        System.out.println();
        System.out.printf("| %24s %22.2f %1s", "TOTAL", total, "|");
        System.out.println();
        System.out.printf("| %28s %18.2f %1s", "REMAINING", remaining, "|");
        System.out.println();
        System.out.println( LOTS_OF_MINUS );
    }
}
