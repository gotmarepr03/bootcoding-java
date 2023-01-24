import java.util.Scanner;

public class NumPattern {

    public static void main(String[] args) {

        int i;
        int j;
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");


        n = sc.nextInt();

        int num = 0;

        for (i = 0; i < n; i++) {
            num++;
            for (j = 0; j <= i; j++) {
                System.out.print(num + "  ");

            }
            System.out.println();
        }
    }

}
