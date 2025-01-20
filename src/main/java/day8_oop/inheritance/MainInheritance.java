package day8_oop.inheritance;

public class MainInheritance {
    public static void main(String[] args) {

        EmployeeInheritance regularEmployee = new EmployeeInheritance("Quelbs", 101, 50000.75);
        FullTimeEmployeeInheritance fte = new FullTimeEmployeeInheritance("Quelbs", 101, 50000.75, 25000);
        PartTimeEmployeeInheritance pt = new PartTimeEmployeeInheritance("Quelbs", 101, 50000.75, 4, 2000);

        System.out.println("Regular Employee");
        regularEmployee.displayEmployeeInfo();
        regularEmployee.calculateSalary();
        System.out.println();
        System.out.println("Full Time Employee");
        fte.displayEmployeeInfo();
        fte.calculateSalary();
        System.out.println();
        System.out.println("Part Time Employee");
        pt.displayEmployeeInfo();
        pt.calculateSalary();
    }
}
