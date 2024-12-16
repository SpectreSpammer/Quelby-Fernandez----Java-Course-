package day3_variables_and_data_types.reference;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee designer = new Designer();



        Employee[] employees = {manager,developer,designer};
        for(Employee emp : employees){
            emp.work();
            emp.lunch();
            emp.attendMeeting();
        }


    }
}
