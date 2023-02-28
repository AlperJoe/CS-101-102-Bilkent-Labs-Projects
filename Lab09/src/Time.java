public class Time {

    //declaring variables
    private int hours;
    private int minutes;

    //constructor
    public Time(int userHour, int userMinute){
        hours = userHour;
        minutes = userMinute;
    }
    //public yap
    //accessors (getters)
    public int getMinute(){
        return minutes;
    }
    private int getHours(){
        return hours;
    }
    //(setters)


    public void addTime(int minutes){
        int time;
        this.minutes += minutes;

        while (this.minutes >= 60){
            this.minutes -= 60;
            hours ++;
        }
        while(this.hours >= 24){
            this.hours -= 24;
        }
    }
    public boolean lessThan(Time Object) {

        if (this.hours < (Object.hours)) {
            return true;
        }
        else if(this.hours == (Object.hours)){
            if(this.minutes < (Object.minutes)){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String h, m, s;
        h = ""+ hours;
        m = "" + minutes;

        if(hours < 10){
            h = "0" + h;
        }
        if (minutes < 10){
            m = "0" + m;
        }
        s = h +":"+ m;
        return s;
    }
}
