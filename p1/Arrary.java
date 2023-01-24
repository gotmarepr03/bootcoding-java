
// java.util.Arrarys;
import java.util.Scanner;
import java.io.*;

public class Arrary {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A[] = new int[5];

        int B[] = { 1, 2, 3, 4, 5 };

        int C[];
        C = new int[10];

        System.out.println(B[3]);

        for (int i = 0; i <= A.length; i++) {

            System.out.println("Enter the values:");
            A[i] = in.nextInt();
        }

        for (int i = 0; i <= A.length; i++) {

            System.out.println(A[i]);

        }

    }

}
