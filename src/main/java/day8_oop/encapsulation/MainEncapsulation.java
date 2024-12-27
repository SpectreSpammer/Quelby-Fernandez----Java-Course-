package day8_oop.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        EmployeeEncapsulation employee = new EmployeeEncapsulation(1,"Quelbs", 50000.75);

        // accessed the getters
        System.out.println("Employee Id: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());

        System.out.println();
        //accessed the setters
        System.out.println();
        employee.setName("Que");
        System.out.println("Employee Name: " + employee.getName());
        employee.setSalary(-50000.75);
        System.out.println();

        employee.salaryIncreaseByPercentage(-10);

    }
}
