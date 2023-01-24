import java.util.Scanner;

public class RecurssiveSum {

    static int i = 1;
    static int n = 0;
    static int sum = 0;

    public static void Sum(int n) {
        if (i <= n) {

            i++;
            sum = sum + i;
            i++;
            // System.out.println(sum);
            Sum(n);
        } else {
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter the value of n :---");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Sum of all no. from 1 to n : ---");

        Sum(n);
    }

}
