public class Reverse {

    public static void main(String[] args) {

        int A[] = { 2, 4, 5, 3, 4 };

        System.out.println("Given Array is : ");

        for (int i = 0; i < A.length; i++) {

            System.out.print(A[i]);
        }

        // length of an arrar is 5 so if we take i=0 as 1st position then i=4 the 5th
        // position;
        // thats why we take (A.length-1);

        System.out.println( );
        System.out.println("Reverse: ");

        for (int i = (A.length - 1); i >= 0; i--) {

            System.out.print(A[i]);
        }
    }

}
