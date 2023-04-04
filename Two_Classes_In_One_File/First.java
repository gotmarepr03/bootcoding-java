// It can not be public 
class second {
    int a = 9;
    int b = 10;

    void display() {
        System.out.println("Im in second class.");
    }
}

// It can not be public
class Third {
    int a = 9;
    int b = 10;

    void display() {
        System.out.println("Im in Third class.");
    }
}

// Only "Driver class will can be Public"
// Driver class = "One that carries Main Methode"
public class First {
    public static void main(String[] args) {
        System.out.println("Im in first class.");

        // "Object" of second class
        second s = new second();
        // "Object" of Third class
        Third t = new Third();
        System.out.println(s.a);

        // Calling the "display()" methode in "second" class.
        s.display();
        // Calling the "display()" methode in "Third" class.
        t.display();
    }

}
