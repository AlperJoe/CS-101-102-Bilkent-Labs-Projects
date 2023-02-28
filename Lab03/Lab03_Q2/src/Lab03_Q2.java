/*
Program that determines the age dependency category
for a given country with input from the user
Alper Bozkurt
23.03.2020
 */
import java.util.Scanner;
public class Lab03_Q2 {
    public static void main(String[] args){

        //constants
        final double MAKE_PERCENTAGE = 100.0;

        //variables
        Scanner input;
        long peopleNum0To15;
        long peopleNum15To64;
        long peopleNum64ToInfinity;
        double childDependencyRate;
        double seniorDependencyRate;
        String ageDependencyCategory = null;

        //input three value from user
        input = new Scanner(System.in);
        System.out.print("Enter number citizen under 15: ");
        peopleNum0To15 = input.nextLong();
        System.out.print("Enter number citizen between 15 and 64: ");
        peopleNum15To64 = input.nextLong();
        System.out.print("Enter number citizen over 64: ");
        peopleNum64ToInfinity = input.nextLong();

        //calculate child and senior dependency
        childDependencyRate = MAKE_PERCENTAGE * peopleNum0To15 / peopleNum15To64 ;
        seniorDependencyRate = MAKE_PERCENTAGE * peopleNum64ToInfinity / peopleNum15To64 ;

        //conditions to calculate senior child and age dependency
        if(seniorDependencyRate < 15){
            if(childDependencyRate < 29){
                ageDependencyCategory = "Low Overall Dependency";
            }
            else if(childDependencyRate >= 29 && childDependencyRate <= 45){
                ageDependencyCategory = "Moderate Child Dependency";
            }
            else if(childDependencyRate > 45){
                ageDependencyCategory = "High Child Dependency";
            }
        }
        else if(seniorDependencyRate >= 15){
            if(childDependencyRate >= 29){
                ageDependencyCategory = "Double Dependency";
            }
            else if(seniorDependencyRate < 29){
                ageDependencyCategory = "High Old-age Dependency";
            }
        }

        //print results
        System.out.printf("Child Dependency:%.1f " , childDependencyRate);
        System.out.println();
        System.out.printf("Senior Dependency:%.1f " , seniorDependencyRate);
        System.out.println();
        System.out.println("Age Dependency Category: " + ageDependencyCategory);
    }
}
