public class FinalKeyword {

    public static void main(String args[]) {
        // final keyword is used to create constant variable.......
        // final variable can not be modified once it is initialized/created.....

        final int a = 10;
        // a = 20; // re-assign another value (not allowed)
        // a = 30; // (not allowed)
        final double PI = 3.14;

        final Marker blueMarker = new Marker();
        // it allowed to change the property of an Object
        blueMarker.color = "Blue";
        blueMarker.color = "Red";
    }
}
