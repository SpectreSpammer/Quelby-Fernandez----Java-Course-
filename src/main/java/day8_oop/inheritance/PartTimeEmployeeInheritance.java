package day8_oop.inheritance;

public class PartTimeEmployeeInheritance extends EmployeeInheritance{


    private int hoursWorked;
    private double overTimePay;

    public PartTimeEmployeeInheritance(String name, int id, double salary,int hoursWorked, double overTimePay) {
        super(name, id, salary);
        this.hoursWorked = hoursWorked;
        this.overTimePay = overTimePay;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary() + (overTimePay * hoursWorked);
    }

    @Override
    public void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Hours Worked:" + hoursWorked);
        System.out.println("Over time pay:" + overTimePay);
    }

}
