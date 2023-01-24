import java.io.File;

class FileInfo {
    public static void main(String[] args) {
        File f = new File("G:\\File Handling\\CreateFile.txt");
        // Creating Object "f" Of class "File" & Creating a path for ".txt" File..

        if (f.exists())
        // Weather to check the "File" Denoting "Abstract filename" exist or NOt..!
        {
            System.out.println(" 1). File Name     :- " + f.getName());
            // " .getName() " methode checks the Name of "File"

            System.out.println(" 2). File Location :- " + f.getAbsolutePath());
            // " .getAbsolutePath() " methode checks the " File Path "

            System.out.println(" 3). File Write    :- " + f.canWrite());
            // " .canWrite() " methode checks weather the "File" is "Writable or Not"...

            System.out.println(" 4). FIle Read     :- " + f.canRead());
            // " .canRead() " methode checks weather the "File" is "Readable or Not"...

            System.out.println(" 5). File Size     :- " + f.length());
            // " .length() " methode checks the "Size" of file...

            System.out.println(" 6). File Remove   :- " + f.delete());
            // " .delete()" methode use to delete the file...

        } else {
            System.out.println(" FIle Doesn't Exist...!");
        }
    }
}