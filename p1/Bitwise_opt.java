import java.util.Scanner;
// import java.Bitwise_opt;

public class Bitwise_opt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Enter the value of x: ");

        x = sc.nextInt();

        y = x << 1;

        System.out.println(y);
    }
}