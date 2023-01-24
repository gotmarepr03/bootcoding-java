import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class insertionSortUnique {

    public static void main(String[] args) {

        File file = new File("G:\\unique.txt");
        File f = new File("G:\\insertionSortUnique.txt");
        List<Integer> l = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        try {
            Scanner s = new Scanner(file);

            while (s.hasNext()) {
                int element = Integer.parseInt(s.next());
                l.add(element);
            }
            System.out.println(l);
            int arr[] = new int[l.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = l.get(i);
            }

            for (int i = 0; i < arr.length; i++) {
                int current = arr[i];
                int j = i - 1;
                while (j >= 0 && current < arr[j]) {

                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = current;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "  ");
            }
            if (f.createNewFile()) {
                System.out.println("file created ");
            } else {
                System.out.println("file already exist");
            }
            FileWriter fw = new FileWriter(f.getAbsolutePath());
            for (int i = 0; i < arr.length; i++) {
                fw.write(Integer.toString(arr[i]) + "\n");
            }
            System.out.println("file created ");
            fw.close();
            s.close();
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
