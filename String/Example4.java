public class Example4 {
    public static void main(String args[]) {

        String s1 = "Vedang";
        String s2 = "Date";
        String s3 = new String("Vedang");
        String s4 = "Vedang";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}
