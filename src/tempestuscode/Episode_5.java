package tempestuscode;

public class Episode_5 {
    public static void main(String[] args) {
        // this is the integers and math episode
        int cool_Number = 20;
        int cool_OtherNumber = 1;

        System.out.println("These are two numbers: " + cool_Number + "," + cool_OtherNumber);

        int sum = cool_Number + cool_OtherNumber;
        System.out.println("Addition: " + sum);

        int sub = cool_Number - cool_OtherNumber;
        System.out.println("Subtraction: " + sub);

        int mult = cool_Number * cool_OtherNumber;
        System.out.println("Multiplication: " + mult);

        int div = cool_Number * cool_OtherNumber;
        // will result in non-decimal number due to it being in integer value.
        System.out.println("Division: " + div);

        int remainder = 500 % 5;
        System.out.println("Remainder: " + remainder);

        // to check if something is an even number, input the following: number % 2
        // this will give a non-zero remainder if it is odd, and a zero remainder if it is even.

        double ceiling = Math.ceil(50.5);
        double round = Math.round(50.5);
        double floor = Math.floor(50.5);

        int min = Math.min(500, 1000);
        int max = Math.max(500, 1000);

        System.out.println("Ceiling: " + ceiling);
        System.out.println("Round: " + round);
        System.out.println("Floor: " + floor);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}