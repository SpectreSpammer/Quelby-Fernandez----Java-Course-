package day8_oop.abstraction;

public class FullTimeEmployeeAbstract  extends  EmployeeAbstract{

    private double bonus;

    public FullTimeEmployeeAbstract(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }


    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}
