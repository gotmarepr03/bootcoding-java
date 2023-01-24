import java.util.*;

public class Swapping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a and b: ");

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping value are:");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
