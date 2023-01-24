import java.util.Scanner;
import java.util.*;

public class Atm {

    void card(int i) {
        if (i == 1) {
            System.out.println("CARD inserted properly");
        } else if (i == 0) {
            System.out.println("CARD is not inserted properly, Please try Again.");
        } else {
            System.out.println("Please insert a CARD");

        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the number :");

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        Atm atm = new Atm();

        atm.card(i);
    }

}
