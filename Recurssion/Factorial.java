import java.util.Scanner;

public class Factorial {

    public static int factor(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factor(n - 1));
        }

    }

    public static void main(String[] args) {

        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:---");

        int n = sc.nextInt();
        fact = factor(n);
        System.out.println("Fcatorial of " + n + " is === " + fact);

    }
}