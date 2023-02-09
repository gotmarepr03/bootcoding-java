import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args)
            throws Exception {
        try {

            String s = "some mistake get made thats all right thats okk";

            Scanner sc = new Scanner(s);

            System.out.println("Scanner : " + sc.nextLine());

            sc.close();

            System.out.println("Scanner is closed");

            System.out.println("Trying to use scanner after closing..");

            System.out.println(sc.nextLine());
        }

        catch (Exception e) {
            System.out.println("Exception is thrown..");
        }
    }

}
