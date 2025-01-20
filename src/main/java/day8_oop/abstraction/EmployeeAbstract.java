package day8_oop.abstraction;

public abstract class EmployeeAbstract {

    protected String name;
    protected int id;
    protected double salary;


    public EmployeeAbstract(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract double calculateSalary();

    public void displayEmployeeInfo(){
        System.out.println("Employee Id:" + id);
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Salary:" + salary);
        System.out.println("Total Salary:" + calculateSalary());
    }
}
