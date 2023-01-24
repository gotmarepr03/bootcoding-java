import java.util.Scanner;

public class Shifting {
    public static void main(String agrs[]) {
        int a;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        // a = -10;

        a = a << 1;

        System.out.println("Value after Shifting: " + a);

    }

}
