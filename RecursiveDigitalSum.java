import java.util.Scanner;

public class RecursiveDigitalSum {

    public static void Sum(int rem, int num, int sum) {

        if (num > 0) {

            rem = num % 10;
            // System.out.println(rem);
            sum = sum + rem;
            num = num / 10;
            Sum(rem, num, sum);
        } else {
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int rem = 0;
        int num;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:----");
        num = sc.nextInt();

        System.out.println("Sum of Digits in a given Number:----");
        Sum(rem, num, sum);

    }

}
