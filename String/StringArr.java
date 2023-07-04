public class StringArr {
    public static void main(String[] args) {

        /*--Taking a String--*/
        String name = "Pranay Gotmare";

        /*--Creating an Charcter Array of length of string--*/
        // char[] ch = new char[name.length()];

        // methode 2nd:
        char[] ch = name.toCharArray();

        /*--assigning each char in Array--*/

        /**
         * for (int i = 0; i < name.length(); i++) {
         * 
         * ch[i] = name.charAt(i);
         * }
         **/

        /*--Printing the Array--*/
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
