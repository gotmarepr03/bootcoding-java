import java.util.Scanner;

public class SumOfUnique {
    static int num[] = { 1, 2, 3, 2 };

    public static void unique() {

        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j < num.length; j++) {
                // System.out.println("i = " + num[i]);
                // System.out.println("j = " + num[j]);

                if (num[i] == num[j]) {
                    count++;
                    // System.out.println("count = " + count);
                } else {
                    System.out.println("Invalid");

                }
            }
            if (count == 1) {
                System.out.println("unique no is " + num[i]);
                sum = sum + num[i];
            } else {
                System.out.println(num[i] + " is Non-Unique no. !!!");

            }
        }
        System.out.println("Sum " + sum);

    }

    public static void main(String[] args) {
        unique();
    }

}
