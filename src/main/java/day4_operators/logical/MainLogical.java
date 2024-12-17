package day4_operators.logical;

public class MainLogical {
    public static void main(String[] args) {

        double salary = 80000;
        int hoursOfWorked = 40;
        int yearsOfService =  1;


        // AND &&
        // TRUE && TRUE
        if(hoursOfWorked >= 40 && salary <= 50000){
            System.out.println("1. Quelbs was worked for more than 40 hrs this week and his salary is less than Php 50k ");
        }else{
            System.out.println("1. Quelbs was worked for less than 40 hrs this week and his salary is more than Php 50k ");
        }

        // || OR
        //false || false
        if(yearsOfService > 5 || salary > 100000){
            System.out.println("2. Quelbs is either a long time employeee or highly paid");
        }else{
            System.out.println("2. Quelbs is neither a long time employeee nor highly paid");
        }

        // !=
        if(salary != 60000){
            System.out.println("3. Salary is not equal to Php 60,000");
        }else{
            System.out.println("3. Salary is equal to Php 60,000");
        }

    }
}
