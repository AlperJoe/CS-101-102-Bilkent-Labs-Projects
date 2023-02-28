public class Department {

    //stores the name of the department
    private String deptName;

    //stores the code of the department
    private String deptCode;

    //contructor
    public Department(String name, String code){
        deptName = name;
        deptCode = code;
    }

    //Accessor methods (getter)
    public String getDepartmentName(){return deptName;}
    public String getDepartmentCode(){return deptCode;}

    //Mutator methods (setter)
    public void setDepartmentName(String name){deptName = name;}
    public void setDepartmentCode(String code){deptCode = code;}

    //Other methods
    public boolean equals(Department Object){
        if(getDepartmentName() == (Object.getDepartmentName())){
            if(getDepartmentCode() == (Object.getDepartmentCode())){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }

    }
    public String toString(){
        String s;
        s = "DeptName: " + deptName + "Dept Code: " + deptCode ;
        return s;
    }
}
