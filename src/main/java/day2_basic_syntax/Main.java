package day2_basic_syntax;

public class Main {
    public static void main(String[] args) {

        SayHelloMessage.sayHello();

        //object declaration
        SayHelloMessage message = new SayHelloMessage();
        message.message();

        sayMessage();
    }

    private static void sayMessage() {
        System.out.println("Hello from main class");
    }
}
