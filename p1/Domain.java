public class Domain

{
    public static void main(String args[]) 
    {
        String str = "gotmare0@hot.com";

        System.out.println("Email Adddress: " + str);

        int i = str.indexOf("@");

        System.out.println("Index of @ : " + i);

        String username = str.substring(0, i);

        System.out.println("Username = " + username);

        String domain = str.substring(i + 1, (str.length()));

        System.out.println("Domain = " + domain);

        int j = domain.indexOf(".");

        System.out.println("Index of . : " + j);

        String name = domain.substring(0, j);

        System.out.println("Name : " + name);

        System.out.println(name.equals("gmail"));

    }

}
