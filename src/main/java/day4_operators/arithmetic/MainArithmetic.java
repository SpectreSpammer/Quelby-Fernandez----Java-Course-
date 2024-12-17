package day4_operators.arithmetic;

public class MainArithmetic {
    public static void main(String[] args) {

        double salary = 50000.75;
        double bonus = 25000.75;
        int yearsOfServe = 5;

        //addition
        double grossPay = salary + bonus;
        System.out.println("1. Gross Pay " + grossPay);

        //substraction
        double sss = 1250.75;
        double netPay = salary - sss;
        System.out.println("2. Net Pay " + netPay);

        //multiplication
        double annualGrossSalary = salary * 12;
        System.out.println("3. Gross Pay " + annualGrossSalary);

        //division
        double averageAnnualSalary = salary / yearsOfServe;
        System.out.println("4. Average Annual Salary  " + averageAnnualSalary);

        //modulus -> 0 or 1 -> o = even || 1 -> odd
        double daysUntilNextPay = 365 % 90;
        System.out.println("5.  Modulus -> " + daysUntilNextPay);
    }
}
