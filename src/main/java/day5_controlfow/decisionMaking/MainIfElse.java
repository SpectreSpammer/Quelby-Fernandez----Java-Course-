package day5_controlfow.decisionMaking;

public class MainIfElse {
    public static void main(String[] args) {
        double salary = 80000;
        double bonus = 30000;
        int yearsOfService = 5;
        double hourlyRate = 505.75;


        // equal to ==
        if(yearsOfService == 5){
            System.out.println("1. Years of service is 5 yrs");
        }else {
            System.out.println("1. Years of service is not 5 yrs");
        }


        // not equal !=
        if(salary != 60000){
            System.out.println("2. Salary is not equal to Php 60,000");
        }else{
            System.out.println("2. Salary is equal to Php 60,000");
        }

        // greater than >
        if(hourlyRate >  500){
            System.out.println("3. Hourly rate is greater than 500 php");
        }else {
            System.out.println("3. Hourly rate is less than 500 php");
        }

        //less than <
        if(hourlyRate <  500){
            System.out.println("4. Hourly rate is less than 500 php");
        }else {
            System.out.println("4. Hourly rate is more than 500 php");
        }

        //greater than or equal >=
        double totalCompensation = salary + bonus;
        if(totalCompensation >= 100000){
            System.out.println("5. Total compensation is more than Php 100,000");
        }else {
            System.out.println("5. Total compensation is less  than Php 100,000");
        }

        //less than or equal to <=
        if(yearsOfService <= 10){
            System.out.println("6. The employee is with been the company or less than 10yrs");
        }else {
            System.out.println("6. The employee is with been the company or more than 10yrs");
        }
    }
}
