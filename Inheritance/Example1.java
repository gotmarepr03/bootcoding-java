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
    void set_B(int n2) {
        b = n2;
    }

    /* Printing the value of " b " */
    void show_B() {
        System.out.println("B = " + b);
    }
}

public class Example1 {
    public static void main(String[] args) {

        /* Create the Object of "class A" */
        // A m = new A();
        /* Create the Object of "class B" */
        B n = new B();

        // calling the methodes of class with the help of ther object
        n.set_A(100);// n1 = 100
        n.set_B(200);// n2 = 200
        n.show_A();
        n.show_B();
    }
}
