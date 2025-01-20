package day8_oop.abstraction;

public class PartTimeEmployeeAbstract extends  EmployeeAbstract{

    private double overTimePay;
    private int hoursWorked;

    public PartTimeEmployeeAbstract(String name, int id, double salary, double overTimePay, int hoursWorked) {
        super(name, id, salary);
        this.overTimePay = overTimePay;
        this.hoursWorked = hoursWorked;
    }


    @Override
    double calculateSalary() {
        return salary + (hoursWorked * overTimePay);
    }
}
