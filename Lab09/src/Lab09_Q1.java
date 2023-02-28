import java.util.Scanner;
import java.util.ArrayList;

public class Lab09_Q1 {
    public static void main(String[] args) {

        int divisor;

        ArrayList<Integer> list = filllist();
        ArrayList<Integer> sumList = new ArrayList<>();


        Scanner input = new Scanner(System.in);
        System.out.println("Enter divisor: " );
        divisor = input.nextInt();

        sumDivisible(list, sumList, divisor);



        System.out.println("List: " + list);

        System.out.println("Sum List: " + sumList);

        removeDuplicates(sumList);

        System.out.println("Sum List (no duplicates): " + sumList);


        //fills and return an arraylist with values input by the user
    }
    public static ArrayList<Integer> filllist() {
        int userNumber;

        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter values: ");

        while (input.hasNextInt()) {
            userNumber = input.nextInt();
            list.add(userNumber);
        }
        return list;
    }

    //create list of sum of the elements
    public static void sumDivisible(ArrayList<Integer>list,ArrayList<Integer>sumList, int divisor){
        int sum = 0;

        for (Integer a : list) {
            if (a % divisor != 0) {
                sumList.add(sum);
            }
            else {
                sum += a;
                sumList.add(sum);
            }
        }
    }

    public static void removeDuplicates(ArrayList < Integer > list) {

        int i = 1;
        int before;
        int now;

        while(i< list.size()){
            before = list.get(i -1);
            now = list.get(i);
            if(before == now){
                list.remove(i - 1);
            }
            else{
                i++;
            }
        }
    }
}
