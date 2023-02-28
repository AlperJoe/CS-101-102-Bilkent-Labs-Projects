/*
 * A program that inputs a date and
 * time and turns into a specific format
 * @author Alper Bozkurt
 * @date   18.02.2020
 */

import java.util.Scanner;
public class Lab02_Q3 {
    public static void main( String[] args){

        //constants
        final String CLOCK_PAST = " minutes past ";
        final String SPACE = " ";
        final String COMMA = ",";

        //variables
        Scanner input;
        String dateAndTime;
        int indexOfSlash,
            indexOfSlash2,
            indexOfComma,
            indexOfDash,
            indexOfColon;
        String subFromBeginningToSlash,
               subFromSlashToSlash,
               subFromSlashToComma,
               subFromCommaToDash,
               subFromDashToColon,
               subFromColonToEnd;

        //input from user
        input = new Scanner(System.in);
        System.out.print( "Enter date and time: " );
        dateAndTime = input.nextLine();

        //specify the index to separate them
        indexOfSlash = dateAndTime.indexOf( "/" );
        indexOfSlash2 = dateAndTime.indexOf("/", indexOfSlash + 2 );
        indexOfComma = dateAndTime.indexOf(",", indexOfSlash2 + 2 );
        indexOfDash = dateAndTime.indexOf("-", indexOfComma + 2 );
        indexOfColon = dateAndTime.indexOf(":", indexOfDash + 2 );

        //separate the result
        subFromBeginningToSlash = dateAndTime.substring(0, indexOfSlash );
        subFromSlashToSlash = dateAndTime.substring( indexOfSlash + 1, indexOfSlash2 );
        subFromSlashToComma = dateAndTime.substring( indexOfSlash2 + 1, indexOfComma );
        subFromCommaToDash = dateAndTime.substring( indexOfComma + 1, indexOfDash );
        subFromDashToColon = dateAndTime.substring( indexOfDash + 1, indexOfColon );
        subFromColonToEnd = dateAndTime.substring( indexOfColon + 1 );

        //compile separated pieces to print intended result
        System.out.print( subFromCommaToDash + SPACE + subFromSlashToSlash + SPACE + subFromSlashToComma + COMMA);
        System.out.println( subFromBeginningToSlash + SPACE + subFromColonToEnd + CLOCK_PAST + subFromDashToColon);
    }
}
