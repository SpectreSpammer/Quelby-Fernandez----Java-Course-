package day9_exceptions.uncheckedException;

public class MainUncheckedException {
    public static void main(String[] args) {

        //Nullpointer Exception
        /*
        String name = null;
        System.out.println(name.length());
        */
        try{
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException nullPointerException){
            System.out.println("Caught Exception: " + nullPointerException.getMessage());
        }

        //Array Index Out of Bounds Exception
        /*
            int [] ages = new int[5];
            System.out.println(ages[6]);
         */

        try{
            int [] ages = new int[5];
            System.out.println(ages[6]);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("Caught Exception: " + indexOutOfBoundsException.getMessage());
        }

    }
}
