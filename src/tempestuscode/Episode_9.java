package tempestuscode;

public class Episode_9 {
    public static void main(String []args) {
        // this is the loops episode

        for(int num = 0; num < 100; num++) {
            if(num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println("--------");

        // leap year finder below

        for(int num = 1000; num <= 2000; num++) {
            if(num % 4 == 0 && num % 100 != 0 || num % 100 == 0 && num % 400 == 0) {
                // I DID IT WITHOUT PEEPING AT THE SOLUTION!!!
            // but~ it could've been done better with the use of parenthesis like so:
            // if(num % 4 && (num % 100 != 0 || num % 400 = 0))
            // basically says if the number is divisible by 4 and the number is not evenly divisible by 100 or
            // if it is evenly divisible by 400, keep proceeding
                System.out.println(num);
            }
        }

        int num2 = 100;
        while(num2 <= 100) {
            num2 -= 10;
            if(num2 == 50) {
                continue;
            // the continue keyword essentially resets the loop, which leads to the number not being printed,
            // and thus skipping this number
            }
            if(num2 == 0) {
                break;
            }
            System.out.println("The number is " + num2);
        }
    }
}
