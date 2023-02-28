public class project {

    public static final double TAX = 0.13;
    public static final int OVERHEAD = 50000;
    public static final int EMP_HOURS_WEEK = 45;
    public static final int currentYear = 2021;

    public static int projectCounter = 5000;

    private String projectId;
    private String projectName;
    private char projectType;
    private int personHours;
    private double ratePerHour;
    private int projectWeeks;

    //constructor
    public project(String name, int hours, double rate, int weeks) {
        projectCounter++;

        projectName = name;

        setProjectId();
        setPersonHours(hours);
        setRatePerHour(rate);
        setProjectWeeks(weeks);
        setProjectType(calculatedProjectCost());
    }

    //Accessor methods (getter)
    public String getProjectName() {
        return projectName;
    }

    private String getProjectId() {
        return projectId;
    }

    public char getProjectType() {
        return projectType;
    }

    public int getPersonHours() {
        return personHours;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public int getProjectWeeks() {
        return projectWeeks;
    }

    //Mutator methods (setter)
    public void setProjectName(String name) {
        projectName = name;
    }

    public void setProjectType(double projectCost) {
        if(projectCost > 1000000){
            projectType = 'm';
        }
        else if(projectCost > 500000 && projectCost < 1000000){
            projectType = 'l';
        }
        else if(projectCost > 0 && projectCost < 500000){
            projectType = 's';
        }
        else if(projectCost == 0){
            projectType = 'i';
        }
    }

    public void setPersonHours(int hours) {
        if (hours > 0) {
            personHours = hours;
        } else {
            personHours = 0;
        }
        setProjectType(calculatedProjectCost());
    }

    public void setRatePerHour(double rate) {
        if (rate > 0) {
            ratePerHour = rate;
        } else {
            personHours = 0;
        }
        setProjectType(calculatedProjectCost());
    }

    public void setProjectWeeks(int weeks) {
        if (weeks > 0) {
            projectWeeks = weeks;
        } else {
            projectWeeks = 0;
        }
    }

    private void setProjectId() {
        projectId = currentYear + "-" + projectCounter;
    }

    //Service methods

    public void deactivateProject(){
        projectType = 'i';
        personHours = 0;
        ratePerHour = 0;
    }
    public void activateProject(int hours, double rate){
        personHours = hours;
        ratePerHour = rate;

        setProjectType(calculatedProjectCost());
    }

    public double calculatedProjectCost(){

        double projectCost = (getPersonHours() * getRatePerHour());
        double projectCost2 = projectCost + (projectCost * TAX);

        if(projectCost2 >= 20000){
            projectCost += OVERHEAD;
            projectCost = projectCost + (projectCost * TAX);
            return projectCost;
        }
        else{
            return projectCost2;
        }
    }

    public int calculatePersonResources(){

        int numberOfEmployees = getPersonHours() * (getProjectWeeks() / EMP_HOURS_WEEK);

        return numberOfEmployees;
    }

    public int compareProject(project p1){

        if(calculatedProjectCost() < p1.calculatedProjectCost()){
            return 1;
        }
        else if(calculatedProjectCost() == p1.calculatedProjectCost()){
            return 0;
        }
        else{
            return -1;
        }
    }

    public String toString(){
        String s;
        if(projectType == 'i'){

            s = "-------INACTIVE PROJECT------" +
                    "\nProject name: " + projectName + "\nProject ID: " + projectId;

        }
        else{
            s = "Project name: " + projectName + "\nProject ID: " + projectId +
                    "\nProject type: " + projectType + "\nTeam Size: " + calculatePersonResources()+
                    "\nEstimated Project Cost: " + calculatedProjectCost();
        }


        return s;
    }
}
