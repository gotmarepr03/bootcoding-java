class Maximun {

    public int max(int arr[]) {

        int Max = 0;

        for (int j = 0; j < arr.length; j++) {

            if (Max < arr[j]) {
                Max = arr[j];
            }
        }
        return Max;

    }
}

class Minimum {
    public int min(int[] arr) {
        int min = arr[0]; // Initialize min with the first element of the array

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

public class MaxMin {

    public static void main(String[] args) {

        int A[] = { 2, 4, 7, 8, 3, 4, 6, 2, 9 };

        Maximun m = new Maximun();
        Minimum n = new Minimum();

        System.out.println("Maximum no:-" + m.max(A));
        System.out.println("Minimum no:-" + n.min(A));

    }

}
