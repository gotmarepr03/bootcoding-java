import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample2 {

    public static void main(String[] args) throws IOException {

        // THis will check whether thr file'Name2.txt' exists or not and
        // if it doesn't exist it will creat one and
        // if it does exist then it will erase all the data in it..
        FileOutputStream fout = new FileOutputStream("G:/JAVA/FileHandling/Name2.txt");

        // data which we want to write in file
        String s = "TATA";
        // converting the String into Char Array
        char C[] = s.toCharArray();

        for (int i = 0; i < s.length(); i++)
            // write the data into the file
            fout.write(C[i]);

        // or we can also convert it into byte Array as follows;
        // byte b[] = s.getBytes();
        // fout.write(b);

        // close the file
        fout.close();
    }

}
