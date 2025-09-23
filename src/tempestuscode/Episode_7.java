package tempestuscode;

public class Episode_7 {
    public static void main(String []args) {
       // this is the operations episode
        int stones = 20;
        stones += 10;
        // adds X
        stones -= 4;
        // subtracts X
        stones *= 2;
        // multiplies X
        stones /= 4;
        // divides X
        stones ++;
        // adds 1
        System.out.println("You have " + stones + " stone(s)!" );
        stones %= 2;
        // checks if dividing it by X gives a remainder (checks if even or odd)
        System.out.println("Dividing the stones by two, the remainder will be: " + stones + ".");
    }
}
