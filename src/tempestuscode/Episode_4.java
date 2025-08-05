package tempestuscode;

import java.util.Scanner;

public class Episode_4 {
    public static void main(String [] args) {
        System.out.println("This is an output! Now give me your input:");
        //output, stuff from the program to the user
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        //input, stuff from the user to the program
        System.out.println("You typed: " + userInput);

    }
}
