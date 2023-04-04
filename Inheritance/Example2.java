class A {
    protected int a;

    /* setting the value of " a " which is protected */
    void set_A(int n1) {
        a = n1;
    }

    /* Printing the value of " a " */
    void show_A() {
        System.out.println("A = " + a);
    }
}

class B extends A {
    protected int b;

    /* setting the value of " b " which is protected */
    void set_B(int n1, int n2) {
        a = n1;
        b = n2;
    }

    /* Printing the value of " b " */
    void show_B() {
        System.out.println("B = " + b);
    }
}

public class Example2 {
    public static void main(String[] args) {

        /* Create the Object of "class A" */
        // A m = new A();
        /* Create the Object of "class B" */
        B n = new B();

        // calling the methodes of class with the help of ther object
        n.set_A(100);// n1 = 100;
        n.show_A();
        n.set_B(200, 300);// n1 = 200, n2 = 300;
        n.show_A();
        n.show_B();
    }
}
