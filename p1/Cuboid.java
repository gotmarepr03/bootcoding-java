import java.util.*;

public class Cuboid {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int l, b, h;
        int TotalArea, Volume, perimeter;

        System.out.println("Enter the values of l, b and h: ");

        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();

        TotalArea = 2 * (l * b + l * h + b * h);
        Volume = (l * b * h);
        perimeter = 4 * (l + b + h);

        System.out.println("Total Area is " + TotalArea + " cm^2");
        System.out.println("Volume is " + Volume + " cm^3");
        System.out.println("Perimeter is " + perimeter + " cm");

    }
}
