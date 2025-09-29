package tempestuscode;

import java.util.Scanner;

public class Episode_10 {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        while(!stop) {
            System.out.println("Please choose an operation (+, -, x, /).");
            String operation = scanner.next();

            switch (operation) {
                case "+":
                    System.out.println("Give the first number.");
                    int addNumber1 = scanner.nextInt();
                    System.out.println("Give the second number.");
                    int addNumber2 = scanner.nextInt();
                    int sum = addNumber1 += addNumber2;
                    System.out.println("The sum is: " + sum);
                    System.out.println("Do you want to continue? [yes] [no]");
                    String yesOrNo1 = scanner.next();
                    if (yesOrNo1.equals("no")) {
                        stop = true;
                        break;
                    } else {
                        continue;
                    }
                case "-":
                    System.out.println("Give the number to be subtracted from.");
                    int subtractNumber1 = scanner.nextInt();
                    System.out.println("Give the number to subtract.");
                    int subtractNumber2 = scanner.nextInt();
                    int difference = subtractNumber1 -= subtractNumber2;
                    System.out.println("The difference is: " + difference);
                    System.out.println("Do you want to continue? [yes] [no]");
                    String yesOrNo2 = scanner.next();
                    if (yesOrNo2.equals("no")) {
                        stop = true;
                        break;
                    } else {
                        continue;
                    }
                case "x":
                    System.out.println("Give the first number.");
                    int multiplyNumber1 = scanner.nextInt();
                    System.out.println("Give the second number.");
                    int multiplyNumber2 = scanner.nextInt();
                    int product = multiplyNumber1 += multiplyNumber2;
                    System.out.println("The product is: " + product);
                    System.out.println("Do you want to continue? [yes] [no]");
                    String yesOrNo3 = scanner.next();
                    if (yesOrNo3.equals("no")) {
                        stop = true;
                        break;
                    } else {
                        continue;
                    }
                case "/":
                    System.out.println("Give the number to be the dividend.");
                    float divideNumber1 = scanner.nextFloat();
                    System.out.println("Give the number to be the divisor.");
                    float divideNumber2 = scanner.nextFloat();
                    float quotient = divideNumber1 /= divideNumber2;
                    System.out.println("The quotient is: " + quotient);
                    System.out.println("Do you want to continue? [yes] [no]");
                    String yesOrNo4 = scanner.next();
                    if (yesOrNo4.equals("no")) {
                        stop = true;
                        break;
                    } else {
                        continue;
                    }
                default:
                    System.out.println("You have inputted the wrong word.");
            }
        }
    }
}

/*
well, needless to say, I finished it! (but hella overcomplicated it)
kaupenjoe's code is in the other class in this folder, but here's what I learned from it:

- you don't need to ask the same value in each switch case, you can just add it before the switch
- break ends a loop, but in a switch it just ends the switch
- again, you don't need to ask the value in each switch case, you can just add it after everything.
- while(true) remains on forever (if true is never changed) or (if a break doesn't happen)


*/