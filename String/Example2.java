public class Example2 {
    public static void main(String args[]) {
        String s1 = "vedang";
        String s2 = "Date";
        String s3 = new String("vedang");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));

    }

}
