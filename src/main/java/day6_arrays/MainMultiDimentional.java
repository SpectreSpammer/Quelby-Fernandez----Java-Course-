package day6_arrays;

public class MainMultiDimentional {
    public static void main(String[] args) {

        //normal array
        Object [] name = { "Quelbs", 29, true};
        int [] age = { 29, 30, 31};

        for( Object names : name){
            System.out.println(" - " + names);
        }

        // Object class -> String, int, double, boolean , float , char
        Object[][] employeeData = {
                { "Quelbs", 29, 50000.75, true, 600.75f, 'A'},
                {"Nan", 30, 60000.75, false, 700.75f, 'B' },
                {"Nami", 40, 70000.75, true, 800.75f, 'C' }
        };

        displayEmployeeData(employeeData);

    }

    private static void displayEmployeeData(Object[][] employeeData) {
        for(Object [] employees : employeeData){
            System.out.println("Name: " + employees[0]);
            System.out.println("Age: " + employees[1]);
            System.out.println("Salary: " + employees[2]);
            System.out.println("FTE: " + employees[3]);
            System.out.println("Hourly Rate: " + employees[4]);
            System.out.println("Performance Grade: " + employees[5]);

        }
    }
}
