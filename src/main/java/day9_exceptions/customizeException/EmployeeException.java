package day9_exceptions.customizeException;

public class EmployeeException {

    private String name;
    private double salary;

    public EmployeeException(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) throws InvalidRaiseException{
        if(percentage < 0 || percentage > 100){
            throw new InvalidRaiseException("Invalid raise percentage. Must be 0-100!");
        }
        this.salary += this.salary * (percentage / 100);
    }

    public double getSalary() {
        return salary;
    }
}
