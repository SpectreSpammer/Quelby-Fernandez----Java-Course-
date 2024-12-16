package day3_variables_and_data_types;

public class Main {
    public static void main(String[] args) {

        //variable type + variable name = variable name;

        //8 bit
        byte age = 29;
        System.out.println("byte: " + age);

        //16 bit
        short deptCode = 101;
        System.out.println("short: " + deptCode);

        char performanceGrade = 'C';
        System.out.println("char: " + performanceGrade);

        //32 bit
        float hourlyRate = 500.12346678901f;
        System.out.println("float: " + hourlyRate);

        int empId = 12345;
        System.out.println("int: " + empId);

        //64 bit
        long sss = 1234567890987654321L;
        System.out.println("long: " + sss);

        double annualSalary = 1200000.1234567890;
        System.out.println("double: " + annualSalary);


        //String
        String name = "nan$#@#";
        System.out.println("String: " + name);

        //boolean
        boolean isFullTime = true;
        System.out.println("boolean: " + isFullTime);
    }
}
