
import java.util.*;

public class solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the value : ----");
        int N = scanner.nextInt();
        // Constraints:
        // if NUmber is odd, print "weird";
        // if NUmber is even,between 2 to 5, print "Not weird";
        // if NUmber is even,between 6 to 20 print "weird";
        // if NUmber is even,above 20 , print "Not weird";
        if (N % 2 == 0) {

            if (2 <= N && N <= 5) {
                System.out.println("Not Weird");
            } else if (6 <= N && N <= 20) {
                System.out.println("Weird");
            } else if (N >= 20) {
                System.out.println("Not Weird");
            }

        } else {
            System.out.println("Weird");
        }

        // .close()is used for closing the scanner .After this we can't use scanner
        // agian;
        scanner.close();
    }
}
