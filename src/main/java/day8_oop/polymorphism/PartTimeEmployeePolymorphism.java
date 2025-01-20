package day8_oop.polymorphism;

public class PartTimeEmployeePolymorphism implements EmployeeInterface{

    private String name;
    private int id;
    private double salary;
    private int hoursWorked;
    private double overTimePay;

    public PartTimeEmployeePolymorphism(String name, int id, double salary, int hoursWorked, double overTimePay) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
        this.overTimePay = overTimePay;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double salary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        return salary + ( hoursWorked * overTimePay);
    }


}
