package tempestuscode;

import java.util.Scanner;

public class tests_Episode_6 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you going to draw a card?");
        boolean isDrawing = scanner.nextBoolean();

        System.out.println("Do you have a library?");
        boolean hasLibrary = scanner.nextBoolean();

        boolean canDraw = isDrawing && hasLibrary;
        System.out.println("Do you draw? " + canDraw);

        System.out.println("Give a number...");
        int number = scanner.nextInt();

        boolean numberVs100 = number >= 100;
        System.out.println("Is your number greater than 100? " + numberVs100);

    }

}
