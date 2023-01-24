import java.lang.*;
import java.util.*;

class useRadix {
    public static void main(String args[]) {
        System.out.println("Enter the Binary number:-\n");

        Scanner s = new Scanner(System.in);

        s.useRadix(4);

        int x = s.nextInt();

        System.out.println("Decimal conversion: \n" + x);
    }
}