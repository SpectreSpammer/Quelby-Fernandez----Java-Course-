package day7_methods;

public class MainMethod {
    public static void main(String[] args) {

        displayEmployeeInfo("Quelbs", 29);

        double salary = calculateSalary(700, 8);
        System.out.println(" 2. With Return value with 2 params ");
        System.out.println(" - Daily Salary: " + salary);

        double netSalary = calculateSalary(60000, 10000);
        System.out.println(" 3. With Return value with 2 params ");
        System.out.println(" - Net Salary: " + netSalary);

        System.out.println(" 4. With Return value with 2 params - ( String + double ) ");
        System.out.println("Salary based on performance " + calculateSalary(70000,"good"));


    }

    private static double calculateSalary(double hourlyRate, int workingHours) {
        return hourlyRate * workingHours;

    }

    private static double calculateSalary(double salary, float deductions) {
        return salary - deductions;

    }

    private static String calculateSalary(double salary, String performanceRating) {
        double percentage;

        switch(performanceRating.toLowerCase()){
            case "excellent":
                percentage = 0.1;
                break;

            case "good":
                percentage = 0.05;
                break;

            default:
                percentage = 0.03;
                performanceRating = "average";
        }

        double totalAmount = salary* percentage;
        return String.format("Employee got a salary of Php %.2f, Performance Rating: %s", totalAmount, performanceRating);

    }


    private static void displayEmployeeInfo(String name, int age) {
        System.out.println(" 1. Void with 2 params ( no return value )");
        System.out.println(" - name "+ name);
        System.out.println(" - age "+ age);
    }

}
