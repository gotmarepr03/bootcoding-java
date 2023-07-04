public class ReverseString {
    public static void main(String[] args) {

        // taking a String
        String name = "Pranay Gotmare";

        // Converting to Character Array
        char[] ch = name.toCharArray();

        // REversing the Stirng using For loop;
        for (int i = (ch.length-1); i >= 0; i--) {
            System.out.print(ch[i]);
        }

    }
}
