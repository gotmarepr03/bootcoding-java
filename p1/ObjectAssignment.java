public class ObjectAssignment {

    public static void main(String args[]) {
        // primitive data types

        int a = 10;
        float b = a;// b <- a {value of a}
        b = 30;// b - change but not changing a
        System.out.println("value of A : " + a);
        System.out.println("value of B : " + b);

        // ADT - Abstarct DAta Type (Object)
        Marker bluMarker = new Marker();
        Marker redMarker = bluMarker; // redMarker <- BlueMarker (reference)
        bluMarker.color = "blue";
        redMarker.color = "red";

        System.out.println("value of BlueMarker : " + bluMarker.color);
        System.out.println("value of RedMarker : " + redMarker.color);

    }

}
