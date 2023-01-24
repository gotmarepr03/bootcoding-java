import java.util.Scanner;

public class LowerRightNumber {

    public static void main(String[] args) {

        int i;
        int j;
        int n;

        System.out.print("Enter the value of n :");

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            int num = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }

        // // int count = 0;

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter values of matrix:");

        // System.out.println("Enter value of i:");
        // i = sc.nextInt();
        // System.out.println("Enter value of j:");
        // j = sc.nextInt();

        // int arr[][] = new int[i][j];

        // for (int a = 0; a < i; a++) {

        // int count = 0;
        // for (int b = 0; b < j; b++) {

        // if (a >= b) {
        // count = count + 1;
        // arr[a][b] = count;

        // } else {
        // arr[a][b] = 0;
        // }

        // System.out.print(" " + arr[a][b]);

        // }

        // System.out.println("");

        // }

    }

}
