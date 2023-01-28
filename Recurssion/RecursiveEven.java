
public class RecursiveEven {

    public void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        if ((n % 2) == 0) {
            System.out.println(n + " ");
        }

        // System.out.print(n);
    }

    public static void main(String[] args) {

        RecursiveEven bs = new RecursiveEven();
        System.out.println("Recursive Even numbers are:-----");
        bs.print(10);
    }

}
