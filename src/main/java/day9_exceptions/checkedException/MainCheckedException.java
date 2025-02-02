package day9_exceptions.checkedException;

import java.io.FileNotFoundException;

public class MainCheckedException {
    public static void main(String[] args) throws FileNotFoundException {

        CheckedException.readFile("C:\\Users\\Mugiwara\\OneDrive\\One Piece of Java");
        CheckedException.connectToDatabase();
    }
}
