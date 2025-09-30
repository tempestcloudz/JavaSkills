package tempestuscode;

public class Episode_11 {
    public static void main(String []args) {
        int number = 0;
        String lessThan = "";
        if (number < 10) {
            lessThan = "The number is less than 10.";
        } else {
            lessThan = "The number is greater or equal to 10.";
        }
        System.out.println(lessThan);
        // is the same as:

        lessThan = number < 10 ? "The number is less than 10." : "The number is greater or equal to 10.";
        System.out.println(lessThan);
        // the first part says that if number is less than 10...
        // the question mark says ... lessThan is now equal to (the value beside it)
        // the colon says ...otherwise, lessThan is now equal to (the value beside it)
    }
}
