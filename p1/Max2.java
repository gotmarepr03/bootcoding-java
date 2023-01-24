import java.util.*;
import java.lang.*;

public class Max2 {
    public static void main(String[] args) {
        int max = 0;
        int max2 = 0;
        int max3 = 0;

        int A[] = { 2, 3, 4, 5, 6, 9, 12, 45, 24 };

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= max) {
                max = A[i];
            }

        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] < max) {
                max2 = A[i];
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] < max2) {
                max3 = A[i];
            }
        }
        System.out.println("max element is : " + max);
        System.out.println("2nd max element is : " + max2);
        System.out.println("3nd max element is : " + max3);
    }

}
