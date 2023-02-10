//In this challenge, we're going to use loops to help us do some simple math.

// Task
// Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

// Input Format

// A single integer, .

// Constraints

// Output Format

// Print  lines of output; each line  (where ) contains the  of  in the form:
// N x i = result.

import java.util.Scanner;

public class TableOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:--");
        int N = sc.nextInt();
        System.out.println(" Table of " + N + " is : ----");

        int result;

        for (int i = 1; i <= 10; i++) {

            if (2 <= N && N <= 20) {

                result = N * i;
                System.out.println(N + " x " + i + " = " + result);
            }
        }
        sc.close();
    }
}
