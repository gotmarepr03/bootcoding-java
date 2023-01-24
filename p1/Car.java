public class Car {

    String brand;
    String color;
    Double price;
    int model;
    int seats;

    void start() {
        System.out.println("Car Succesfully Started....");
    }

    void stop() {
        System.out.println("Car Succesfully Stoped.....");
    }

    void move() {
        System.out.println("Car Moving Backward and Forward.....");
    }

    void print() {
        System.out.println("BRAND : " + brand);
        System.out.println("COLOR : " + color);
        System.out.println("PRICE : " + price);
        System.out.println("MODEL : " + model);
        System.out.println("SEATS : " + seats);
        System.out.println();

    }
}
