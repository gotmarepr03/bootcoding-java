import java.io.*;
// File class is Avalible in "java.io" Package. 

class CreateFIle {
    public static void main(String[] args)
    // throws IOException
    {
        File f = new File("G:\\File Handling\\CreateFile.txt");
        // Creating Object "f" Of class "File" & Creating a path for ".txt" File..
        try {
            //" .createFile()" is methode NEW file...
            if (f.createNewFile()) {
                System.out.println("File Successfully Created...!");
            } else {
                System.out.println("File Alraedy Exist..!");
            }
        } catch (IOException i) {
            System.out.println("File Doesn't Exist..!@");
        }
        // try - catch used for IOException 
        // Means After creating A file if the file is not avalible there ....then the exception will be thrown 

    }
}

