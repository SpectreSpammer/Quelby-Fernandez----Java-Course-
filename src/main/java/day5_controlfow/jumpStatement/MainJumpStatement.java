package day5_controlfow.jumpStatement;

public class MainJumpStatement {
    public static void main(String[] args) {


        int yearsOfService = 3;
        switch (yearsOfService) {
            case 0:
                System.out.println("OJT");
                break;
            case 1:
                System.out.println("New Hire");
                break;
            case 2:
                System.out.println("Intermidiate");
                break;
            case 3:
                System.out.println("Junior");
                break;
            case 4:
                System.out.println("Mid");
                break;
            case 5:
                System.out.println("Senior");
                break;
            default:
                System.out.println("Expert");


                double salary = 50000;
                System.out.println("Salary Increments");
                for (int year = 1; year <= 5; year++) {
                    if (year == 3) {
                        System.out.println("Skipping year 3 due to company policies");
                        break;
                    }

                    salary *= 1.05;
                    System.out.printf("Year %d, Php %.2f %n", year, salary);
                }
        }
    }
}

