import java.util.*;
import java.lang.*;

public class max {
    public static void main(String[] args) {
        int max = 0;

        int A[] = { 4, 5, 3, 8, 9, 12, 14, 3, 6, 9 };

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];

            } else {
                max = max;
            }
        }
        System.out.println("Max element is : " + max);

    }
}
