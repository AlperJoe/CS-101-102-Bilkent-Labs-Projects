public class EmployeeApp {

    public static void main(String[] args) {
        //Create a project
        Project p1 = new Project("SunMarkets POS Implementation",
                315, 320,22);

        //Create 3 Employees who are assigned to the project
        Employee e1 = new Employee("Karakus, Zana", 215.0,
                "Information Technology", "IT", p1);

        Employee e2 = new Employee("Rocca, Denis", 175.0,
                "Human Resources", "HR", p1);

        Employee e3 = new Employee("Anders, Jamie", 275.0,
                "Human Resources", "HR", p1);

        //Create a new employee that is copy of the first
        Employee e1Copy = new Employee(e1);

        //Display the 4 employees
        System.out.println(e1);
        System.out.println();
        System.out.println(e2);
        System.out.println();
        System.out.println(e3);
        System.out.println();
        System.out.println(e1Copy);


        //Compare the Department of all Employees,
        //and display with matching Departments
        int counter = 1;
        System.out.println();
        System.out.println("--------- end employee list --------");

        if(e1.getDepartment().equals(e2.getDepartment())){
            System.out.println();
            System.out.println("____________________________________");
            System.out.println("Employees with matching departments " + counter);
            System.out.println(e1);
            System.out.println();
            System.out.println(e2);
            System.out.println();
            counter ++;
        }
        if(e1.getDepartment().equals(e3.getDepartment())){
            System.out.println();
            System.out.println("____________________________________");
            System.out.println("Employees with matching departments " + counter);
            System.out.println(e1);
            System.out.println();
            System.out.println(e3);
            System.out.println();
            counter ++;
        }
        if(e2.getDepartment().equals(e3.getDepartment())){
            System.out.println();
            System.out.println("____________________________________");
            System.out.println("Employees with matching departments " + counter);
            System.out.println(e2);
            System.out.println();
            System.out.println(e3);
            System.out.println();
            counter ++;
        }
        if(e1.getDepartment().equals(e1Copy.getDepartment())){
            System.out.println();
            System.out.println("____________________________________");
            System.out.println("Employees with matching departments " + counter);
            System.out.println(e1);
            System.out.println();
            System.out.println(e1Copy);
            System.out.println();
            counter ++;
        }
        if(e2.getDepartment().equals(e1Copy.getDepartment())){
            System.out.println();
            System.out.println("____________________________________");
            System.out.println("Employees with matching departments " + counter);
            System.out.println(e1);
            System.out.println();
            System.out.println(e1Copy);
            System.out.println();
            counter ++;
        }
        if(e3.getDepartment().equals(e1Copy.getDepartment())){
            System.out.println();
            System.out.println("____________________________________");
            System.out.println("Employees with matching departments " + counter);
            System.out.println(e1);
            System.out.println();
            System.out.println(e1Copy);
            System.out.println();
            counter ++;
        }
    }
}




