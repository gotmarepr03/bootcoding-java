
import java.util.Scanner;

class calculator {

    public static void calculate(String n, Double a, Double b) {

        String num = n;
        Double x = a;
        Double y = b;

        switch (num) {
            case "Add":
                System.out.println("c = " + (x + y));
                break;
            case "Multi":
                System.out.println("c = " + (x * y));
                break;
            case "Sub":
                System.out.println("c = " + (x - y));
                break;
            case "Div":
                if (y == 0) {
                    System.out.println("Invalid Input");

                } else {
                    System.out.println("c = " + (x / y));
                }
                break;
            case "Mode":
                if (y == 0) {
                    System.out.println("Invalid Input");
                } else {
                    System.out.println("c = " + (x / y));
                }
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type the what you want to do:--");
        System.out.println("1) Add\n" + "2) Multi\n" + "3) Mode\n" + "4) Sub\n" + "5) Div");
        System.out.print("-->>");
        String n = sc.nextLine();

        System.out.println("Value of a :-");
        Double a = sc.nextDouble();
        System.out.println("Value of b :-");
        Double b = sc.nextDouble();

        Double c;

        System.out.println(n + " of x :-");
        calculate(n, a, b);
    }

}
