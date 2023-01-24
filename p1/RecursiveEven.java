public class RecursiveEven {

    public void print(int n) {
        if (n == 0) {
            return;
        }
        print(n - 1);
        if ((n % 2) == 0) {
            System.out.print(n);
        }

        // System.out.print(n);
    }

    public static void main(String[] args) {

        RecursiveEven bs = new RecursiveEven();
        bs.print(10);
    }

}
