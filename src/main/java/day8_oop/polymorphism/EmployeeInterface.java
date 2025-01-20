package day8_oop.polymorphism;

public interface EmployeeInterface {

    String getName();
    int getId();
    double salary();
    double calculateSalary();

    default void displayEmployeeInfo(){
        System.out.println("Employee Id:" + getId());
        System.out.println("Employee Name:" + getName());
        System.out.println("Employee Salary:" + salary());
        System.out.println("Total Salary:" + calculateSalary());
    }
}
