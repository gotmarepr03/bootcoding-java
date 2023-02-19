// input = people with either 50kg or 100kg weight only
// constraints = vechicle capacity
//                - Max weight = 150 kg ;
//                - Max Count = 2 kg ;

public class Count {

    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int out1;
        int out2;
        int x;
        int output;
        System.out.println();

        // int A[] = { 50, 100, 50, 50, 50 };
        // int A[] = { 100, 100, 50, 100 };
        // int A[] = { 50, 50 };
        // int A[] = { 50, 50, 100, 100 };
        int A[] = { 50, 50, 100, 100, 50, 100, 50, 50, 50 };

        System.out.print("A[] = { ");

        for (int i = 0; i < A.length; i++) {

            System.out.print(A[i] + " ");

            if (A[i] == 50) {
                count1 = count1 + 1;
                // System.out.println("NO of 50's= " + count1);
            } else {
                count2 = count2 + 1;
                // System.out.println("NO of 100's= " + count2);

            }

        }
        System.out.println("}");

        // count(50) = count(100);
        if (count1 == count2) {
            output = count1;
            System.out.println();

            System.out.println("Output = " + output);

        }
        // count(50) > count(100)
        else if (count1 > count2) {
            out1 = count2;
            x = (count1 - count2);
            // System.out.println("x = " + x);
            if (x % 2 == 0) {
                out2 = x / 2;
                output = out1 + out2;
                System.out.println();

                System.out.println("Output = " + output);
            } else {
                if (x == 1) {
                    output = out1 + x;
                    System.out.println();

                    System.out.println("Output = " + output);
                } else {
                    int temp = x / 2;
                    out2 = temp + 1;
                    output = out1 + out2;
                    System.out.println();

                    System.out.println("Output = " + output);
                }
            }
        }

        // count(100) > count(50)
        else if (count2 > count1) {
            out1 = count1;
            out2 = (count2 - count1);
            // System.out.println("x = " + x);
            output = out1 + out2;
            System.out.println();

            System.out.println("Output = " + output);
        }

    }

}
