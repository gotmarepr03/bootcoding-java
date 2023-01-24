import java.io.*;

class File_Write {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("G:\\File Handling\\Write_File.txt");

            try {
                // f.write("Java Programming is the BEst Programming Ever..!!");
                Random rand = new Random();

                for (int i = 0; i <= 1000; i++) {
                    int ran_int = rand.nextInt(10000);
                    // Double ran_dbl = rand.nextDouble(10);

                    System.out.println(ran_int);
                }
            } finally {
                f.close();
            }
            System.out.println("Succesfully Data Inseeted in File...!");
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}