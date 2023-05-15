import java.io.File;
import java.io.IOException;

public class FileExample1 {

    public static void main(String[] args) throws IOException {

        // 'f' is the object of the 'File' class ;
        File f = new File("G:/JAVA/FileHandling/name.txt");

        // Creating A file;
        f.createNewFile();

        // check if file exists or not(boolean value[true/false])
        System.out.println("File Exist ??\n" + "-" + f.exists());
        // Get the Name of the File;
        System.out.println("Name of the File\n" + "-" + f.getName());
        // Use for Deleting the file;
        // System.out.println(f.delete());

        // to check the size of the file (KB/MB)
        System.out.println("Size of the File\n" + "-" + f.length());
        // check whether the file id writableor not;
        System.out.println("can Write\n" + "-" + f.canWrite());
        // check whether the file id readable not;
        System.out.println("can Read\n" + "-" + f.canRead());

    }

}
