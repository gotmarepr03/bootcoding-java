import java.util.Scanner;

public class NaturalRecurssion {

    static int count = 0;

    public static void Recurssion(int n) {

        if (count < n) {

            count++;

            System.out.print(count + " ");

            Recurssion(n);
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter the number:-");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Natural numbers upto 50 :--");

        Recurssion(n);
    }

}
