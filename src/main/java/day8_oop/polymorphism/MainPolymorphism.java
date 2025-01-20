package day8_oop.polymorphism;

public class MainPolymorphism {
    public static void main(String[] args) {

        EmployeeInterface fte = new FullTimeEmployeePolymorphism("Quelbs", 101, 50000.75, 25000.75);
        EmployeeInterface pt = new PartTimeEmployeePolymorphism("Nan", 102, 60000.75, 4, 3000);

        fte.displayEmployeeInfo();

        System.out.println();
        pt.displayEmployeeInfo();

    }
}
