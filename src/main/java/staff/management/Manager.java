package staff.management;

import staff.Employee;

public class Manager extends Employee{

    private String deptName;

    public Manager(String name, String nin, double salary, String deptName){
        super(name, nin, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return deptName;
    }

    public void setDeptName(String managerDeptName){
        this.deptName = managerDeptName;
    }

}
