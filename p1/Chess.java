public class Chess {

    String player;
    String color;
    int steps;

    void playermoves() {
        System.out.println("moves in all direction...");
    }

    void kill() {
        System.out.println("killing ather players....");
    }

    void checkmate() {
        System.out.println("winning the game....");
    }

    void print() {
        System.out.println("PLAYER : " + player);
        System.out.println("COLOR : " + color);
        System.out.println("STEPS : " + steps);

    }

}
