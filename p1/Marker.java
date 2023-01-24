public class Marker {

    String color;
    String brand;
    Double price;

    public void write() {
        System.out.println("Write the Sentance");
    }

    public void refill() {
        System.out.println("Refill the marker");
    }

    public void print() {
        System.out.println("COLOR : " + color);
        System.out.println("BRAND : " + brand);
        System.out.println("PRICE : " + price);
        System.out.println();
    }
}
