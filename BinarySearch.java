import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

    public static void binary(int a[], int start, int end, int target) {
        int mid = (start + end) / 2;
        while (start <= end) {
            if (a[mid] < target) {
                start = mid + 1;
            } else if (a[mid] == target) {
                System.out.println("Element is found at index " + mid);
                break;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        if (start > end) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        File file = new File("G:\\insertionSortUnique.txt");
        List<Integer> l = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target number : ");
        int target = sc.nextInt();
        try {
            Scanner s = new Scanner(file);

            while (s.hasNext()) {
                int element = Integer.parseInt(s.next());
                l.add(element);

            }

            int a[] = new int[l.size()];
            for (int i = 0; i < a.length; i++) {
                a[i] = l.get(i);
            }
            long start = System.nanoTime();

            binary(a, 0, (a.length - 1), target);
            long end = System.nanoTime();
            double time = (double) (end - start) / 1000000000;
            System.out.println("Time taken : " + time);
            System.out.println("Tiem taken in nanoseconds :" + (end - start));

            s.close();
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}