package day9_exceptions.checkedException;

import day9_exceptions.customizeException.EmployeeException;
import day9_exceptions.customizeException.InvalidRaiseException;

public class MainCustomizeException {
    public static void main(String[] args) throws InvalidRaiseException {


        EmployeeException emp = new EmployeeException("Quelbs", 50000.75);


        try{
            //valid
            emp.raiseSalary(30);
            //System.out.println("New Salary: " + emp.getSalary());

            //invalid
            emp.raiseSalary(-10);
            System.out.println("this line wont be printed out");
        }catch (InvalidRaiseException invalidRaiseException){
            System.out.println("Caught Exception: "  + invalidRaiseException.getMessage());
        }



    }
}
