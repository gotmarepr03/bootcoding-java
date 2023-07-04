
public class Pattern {
    public static void main(String[] args) {

        int n = 5;
        int m = 7;

        System.out.println("Lower Left:\n");
        Pattern.low_L(n);
        System.out.println("upper Left:\n");
        Pattern.upper_L(n);
        System.out.println("Lower Right:\n");
        Pattern.low_R(n);
        System.out.println("upper Right:\n");
        Pattern.upper_R(n);
        System.out.println("Pyramid1:\n");
        Pattern.pyramid1(n);
        System.out.println("Pyramid2:\n");
        Pattern.pyramid2(n);
        System.out.println("Pyramid:\n");
        Pattern.pyramid_ll(m, n);

    }

    public static void low_L(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

    }

    public static void upper_L(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void low_R(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void upper_R(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void pyramid1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public static void pyramid2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public static void pyramid_ll(int m, int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("x");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("x");
            }
            System.out.println();

        }

    }

}
