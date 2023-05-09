public class Example3 {

    public static void main(String args[]) {
        String s1 = "Vedang";
        String s2 = "Vedang";
        String s3 = new String("Vedang");

        // " == " compares 'reference';

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // flase
        System.out.println(s2 == s3); // flase

    }

}
