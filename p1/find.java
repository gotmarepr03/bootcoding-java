import java.util.*;
import java.lang.*;

public class find {

    public static void main(String[]args)
    {
        int key = 8;
        int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < 10; i++)
        {
            System.out.println(i);

            if(A[i]==key)
            {
                System.out.println("element found at : " + i);
                System.exit(0);
            }
            
        }
    }
    
}
