package day4_operators.ternary;

public class Main {
    public static void main(String[] args) {

        // condition ? expression1 : expression2

        int age = 92;
        System.out.println( age < 65 ? "not yet retired" : "retired");


        boolean isReceivedBonus = false;
        String receivedBonus = isReceivedBonus ? "received bonus" : "not yet received the bonus";

        System.out.println("Quelbs has " + receivedBonus);
    }
}
