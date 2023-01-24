import java.util.*;
import java.util.Scanner;
import java.io.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int A[] = new int[10];
        // int A[] = { 1, 3, 2, 5, 4, 6, 8, 7, 9, 0 };

        // for (int i = 0; i <= 9; i++) {
        // // A[i] = sc.nextInt();
        // // System.out.println("value is :" + A[i]);
        // sum = sum + A[i];
        // }
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
            System.out.println("value is :" + A[i]);

        }
        // System.out.println(sum);
        for (int i = 0; i < A.length; i++) {
            // System.out.println(A[i] + " ");
            sum = sum + A[i];

        }
        System.out.println(sum);

    }

}
