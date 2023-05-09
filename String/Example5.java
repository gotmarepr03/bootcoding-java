public class Example5 {
    public static void main(String args[]) {

        StringBuffer s = new StringBuffer("Vedang");

        System.out.println(s.append("Date"));
        System.out.println(s.insert(2, "xx"));
        System.out.println(s.replace(1, 3, "oo"));
        System.out.println(s.delete(1, 3));
        System.out.println(s.reverse());
    }
}
