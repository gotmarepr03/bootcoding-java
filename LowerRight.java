import java.util.Scanner;

public class LowerRight {
    public static void main(String[] args) {

        int i;
        int j;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of x :");

        i = sc.nextInt();
        System.out.println("Enter value of y :");
        j = sc.nextInt();

        String arr[][] = new String[i][j];

        System.out.println("lower left Right angle triangle pattern of (" + i + "*" + j + ") matrix is :");

        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                if (a >= b) {
                    arr[a][b] = "#";
                } else {
                    arr[a][b] = " ";
                }
                System.out.print("   " + arr[a][b]);
            }
            System.out.println();
        }

    }

}
