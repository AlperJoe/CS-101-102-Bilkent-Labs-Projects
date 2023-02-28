import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        char dayTime;
        String userTime;
        int delayTime;

        ArrayList<Time> timelist = new ArrayList<Time>();
        Scanner input = new Scanner (System.in);

        int hours;
        int minutes;
        //inputs set of time from user
        for(int i = 0; i < 7; i++){
            System.out.println("Enter appointment time: ");
            userTime = input.next();

            int a;
            a = userTime.indexOf(":");
            hours = Integer.parseInt(userTime.substring(0,a));
            minutes = Integer.parseInt(userTime.substring(a+1));

            Time t = new Time(hours, minutes);
            timelist.add(t);
        }
        System.out.println();

        //prints the list of appointment
        System.out.println("Scheduled Appointments: ");

        printAppointments(timelist);
        System.out.println();

        //input a delay start time
        System.out.println("When will delay start (M)orning" + "/ (A)fternoon: ");
        dayTime = input.next().charAt(0);

        System.out.println("How many minutes will the doctor be late: ");
        delayTime = input.nextInt();

        for(int i = 0; i < timelist.size(); i++) {
            Time Tempt = timelist.get(i);
            if (dayTime == 'M') {
                //delay time tüm sayılara ekle
                Tempt.addTime(delayTime);
            }
            else {
                if(!Tempt.lessThan(new Time (12, 30))){
                    Tempt.addTime(delayTime);
                }
            }
        }

        System.out.println();
        //sort the list of appointments and display the updated list
        sortAppointments(timelist);
        System.out.println("Updated appointments: " );
        printAppointments(timelist);
    }
    public static void printAppointments(ArrayList <Time> times){
        for(int i = 0; i < times.size(); i++  ){
            System.out.println(times.get(i));
        }
    }
    public static void sortAppointments(ArrayList<Time> time ){
        int i = 1;

        while(i < time.size()) {
            Time Tempt = time.get(i);
            int j = i - 1;
            while (j >= 0 && Tempt.lessThan(time.get(j))) {
                time.set(j + 1, time.get(j));
                j--;
            }
            time.set(j + 1, Tempt);
            i++;
        }
    }
}
