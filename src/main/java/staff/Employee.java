package staff;

public abstract class Employee {

    protected String name;
    protected String nin;
    protected double salary;

    public Employee(String name, String nin, double salary){
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String employeeName){
        if (employeeName != "") {
            this.name = employeeName;
        }
    }

    public String getNin(){
        return this.nin;
    }

    public void setNin(String employeeNin){
        this.nin = employeeNin;
    }
    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double employeeSalary){
        this.salary = employeeSalary;
    }

    public void raiseSalary(double raise) {
        if (this.salary + raise >= 0) {
            this.salary += raise;
        }
    }

    public void payBonus(){
        this.salary *= 1.01;
    }

}
