package day3_variables_and_data_types.reference;

public class Manager implements Employee{
    @Override
    public void work() {
        System.out.println("Manager is facilitating the team.");
    }

    @Override
    public void lunch() {
        System.out.println("Manager is having a short walk");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Manager is leading the  meeting");

    }
}
