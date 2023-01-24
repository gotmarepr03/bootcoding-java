import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LinearNonUnique {
    public static void main(String args[]) {
        File file = new File("G:\\random.txt");
        List<Integer> l = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        try {
            long start = System.currentTimeMillis();
            Scanner s = new Scanner(file);
            System.out.println("Enter the element to be found: ");
            int ele = sc.nextInt();
            while (s.hasNext()) {
                int element = Integer.parseInt(s.next());
                l.add(element);
            }
            int arr[] = new int[l.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = l.get(i);
            }
            // asking user to find which element
            int loc = 0;
            boolean flag = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ele) {
                    loc = i;
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("Element Found at " + loc);
            } else {
                System.out.println("Element not Found");
            }
            long end = System.currentTimeMillis();
            System.out.println("Execution time (in s) = " + ((end - start) / 1000));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
