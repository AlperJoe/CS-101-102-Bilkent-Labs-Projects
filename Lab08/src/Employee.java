public class Employee {

    //Constant data member
    public static final int WORKING_DAYS = 261;

    //Stores the name of the employee
    private String employeeName;

    //Stores the double daily pay rate of the employee
    private double dailyRate;

    //Stores the Department of the employee
    private Department department;

    //Stores the project the employee has been assigned to
    private Project project;

    //Constructor
    public Employee(String name, double rate, String deptName,
                    String deptCode, Project project ){

        employeeName = name;
        dailyRate = rate;
        department = new Department(deptName, deptCode);
        this.project = project;
    }

    //copy constructor
    public Employee(Employee e1){
        employeeName = e1.getEmployeeName();
        dailyRate = e1.getDailyRate();
        department = e1.getDepartment();
        project = e1.getProject();
    }

    //Accessor methods(getter)
    public String getEmployeeName(){return employeeName;}
    public double getDailyRate(){return dailyRate;}
    public Department getDepartment(){return department;}
    public Project getProject(){return project;}

    //Mutator methods(setter)
    public void setEmployeeName(String name){employeeName = name;}
    public void setDailyRate(double rate){dailyRate = rate;}
    public void setDepartment(Department deptName){department = deptName;}
    public void setProject(String project){project = project;}

    //Other methods
    public double calculateYearlySalary(){
        double yearlySalary;
        yearlySalary = getDailyRate() * WORKING_DAYS;

        return yearlySalary;
    }

    public String toString(){
        String s;
        s = "Employee name: " + employeeName + "  Yearly Salary: " + calculateYearlySalary() +
                "\nDeptName: " + department.getDepartmentName() + "  DeptCode: " + getDepartment().getDepartmentCode()
                + "\nProject Name: " + project.getProjectName() + "\nProject ID: " + project.getProjectId() +
                "\nProject type: " + getProject().getProjectType()
                + "\nTeam Size: " + getProject().calculatePersonResources() + "\nEstimated Project Cost: "
                + getProject().calculateProjectCost();
        return s;

    }
}
