package day3_variables_and_data_types.reference;

public class Designer implements Employee{
    @Override
    public void work() {
        System.out.println("Designer is doing a UI and UX.");
    }

    @Override
    public void lunch() {
        System.out.println("Designer is having his lunch");
    }

    @Override
    public void attendMeeting() {
        System.out.println("Designer is presenting  the  design");

    }
}
