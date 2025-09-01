package tempestuscode;

import java.util.Scanner;

public class Episode_6 {
    public static void main(String [] args) {
        // this is the booleans and conditionals episode

        boolean isCode = true;
        boolean isGame = false;

        System.out.println("This is code: " + isCode + ", but is it a game? " + isGame);

        // COMPARISONS < > >= <= != ==

        int jigabyte = 20;
        int gigabyte = 1000;

        boolean byteComparison = jigabyte >= gigabyte;
        System.out.println(byteComparison);
        // this will print false
        boolean byteComparisonTwo = jigabyte <= gigabyte;
        System.out.println(byteComparisonTwo);
        // this will print true

        /*

        AND, OR, NOT

        [AND]

         A | B | C
         1 | 1 | 1
         0 | 0 | 0
         1 | 0 | 0

         essentially, if A and B are the same, it will print that same value, if they are unlike, it will
         not print a value, or just a false value.

         [OR]

         A | B | C
         1 | 0 | 1
         1 | 1 | 1
         0 | 0 | 1

         essentially, if a or b fulfills the "or" condition, it will print that value
         and vice versa.

         [NOT]

         A | !A
         0 | 1
         1 | 0

         essentially, it will look for the reverse, or just a value that is not the specified value
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Are you from Europe? [say true or false]");
        boolean european = scanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean canDrink = european && age >= euDrinkingAge || !european && age >= usDrinkingAge;
        System.out.println("Can you drink? " + canDrink);





    }
}
