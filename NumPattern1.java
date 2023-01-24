import java.util.Scanner;

public class NumPattern1 {

    public static void main(String[] args) {

        int i;
        int j;
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");

        n = sc.nextInt();

        int num = 1;

        for (i = 0; i < n; i++) {

            for (j = 0; j <= i; j++) {
                System.out.print(num + "  ");
                num++;

            }
            System.out.println();
        }
    }

}
