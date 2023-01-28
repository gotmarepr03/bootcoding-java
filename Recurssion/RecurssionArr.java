
public class RecurssionArr {

    static int i = 0;

    static int arr[] = { 2, 4, 5, 7 };

    public static void Arr() {

        if (i < 4) {
            System.out.print(arr[i] + " ");
            i++;
            Arr();
        }
    }

    public static void main(String[] args) {

        System.out.println("Elements of Array Are:----");
        System.out.print("{ ");
        Arr();
        System.out.print("}");

    }

}
