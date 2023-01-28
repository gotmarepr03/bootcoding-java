import java.util.Scanner;

public class RecursiveDigitalCount {

    public static void digital(int count, int num) {

        if (num > 0) {

            count++;
            num = num / 10;
            digital(count, num);
        } else {
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        int count = 0;
        int num;

        System.out.println("Enter the value:-----");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println("The number of Digits in given number are:----");
        digital(count, num);
    }

}
