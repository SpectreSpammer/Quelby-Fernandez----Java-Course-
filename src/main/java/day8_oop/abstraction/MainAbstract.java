package day8_oop.abstraction;

public class MainAbstract {
    public static void main(String[] args) {

        EmployeeAbstract fte = new FullTimeEmployeeAbstract("Quelbs", 101, 50000.75, 25000.75);
        EmployeeAbstract pt = new PartTimeEmployeeAbstract("Nan", 102, 60000.75, 2500, 4);

        fte.displayEmployeeInfo();
        System.out.println("Total salary for full time employee: " + fte.calculateSalary());
        System.out.println();
        pt.displayEmployeeInfo();
        System.out.println("Total salary for part time employee: " + pt.calculateSalary());
    }
}
