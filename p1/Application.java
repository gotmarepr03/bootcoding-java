public class Application {

    public static void main(String args[])

    {

        // Syntax: ClassName ObjectName = new ClassName();

        // creating an object of Marker class
        Marker marker = new Marker();

        marker.color = "Black";
        marker.brand = "camlin";
        marker.price = 50.40;

        marker.print();
        marker.refill();
        marker.write();

        // creating an object of Car class
        Car car = new Car();

        car.brand = "kawasaki";
        car.color = "white";
        car.price = 142.45;
        car.seats = 5;
        car.model = 2014;

        car.stop();
        car.start();
        car.move();
        car.print();

        // creating an object of Chess class
        Chess chess = new Chess();

        chess.player = "Queen";
        chess.color = "White";
        chess.steps = 8;

        chess.playermoves();
        chess.kill();
        chess.checkmate();
        chess.print();

        // creating an object of Cricket class
        cricket cr = new cricket();

        cr.over = 12;
        cr.runs = 45;
        cr.players = 11;
        cr.sixs = 7;
        cr.fours = 5;

        cr.batting();
        cr.balling();
        cr.keeping();
        cr.print();
    }

}
