package day5_controlfow.decisionMaking;

public class MainSwitch {
    public static void main(String[] args) {

        String dept = "iT";

        switch(dept.toLowerCase()){
            case "it" :
                System.out.println(" This dept is IT");
                break;
            case "hr" :
                System.out.println(" This dept is HR");
                break;

            case "pr" :
                System.out.println(" This dept is PR");
                break;

            case "sales" :
                System.out.println(" This dept is sales");
                break;

            default:
                System.out.println(" This dept is admin");
        }
        System.out.println("----------------");

        int yearsOfService = 3;
        switch (yearsOfService){
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


        }
    }
}
