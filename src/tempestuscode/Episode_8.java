package tempestuscode;

import java.util.Scanner;

public class Episode_8 {
    public static void main(String []args) {
        // this is the "if" and "switch" episode
        int rocks = 10;
        if (rocks == 10) {
            System.out.println("You have a sizeable collection of rocks!");
        } else {
            System.out.println("I dunno what to say about that, I only know the number 10.");
        }

        switch (rocks) {
            case 10:
                System.out.println("Sizeable collection.");
                break;
            case 20:
                System.out.println("Much more in your collection.");
                break;
            case 30:
                System.out.println("That's a LOT of rocks...");
                break;
            default:
                System.out.println("Uhh... I dunno, I only know the numbers 10, 20, and 30.");
                break;
        }

        Scanner input = new Scanner(System.in);
        int minerals = input.nextInt();
        if (minerals >= 20 && minerals <= 50) {
            System.out.println("My my, a sizeable collection");
        } else if (minerals >= 51 && minerals <= 100) {
            System.out.println("A marvelous collection!");
        } else if (minerals >= 101 && minerals <= 999) {
            System.out.println("An astounding collection!!");
        } else if (minerals >= 1000) {
            System.out.println("AN INCREDULOUS AMOUNT, BY THE HEAVENS, WHAT A MAGNIFICENT COLLECTION!!");
        } else if (minerals <= 20) {
            System.out.println("A pitiful amount.");
        }
    }
}
