public class LinkListExample {

    public static void main(String[] args) {

        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        Node head = firstNode;

    }

    public static Node insertNodeAtFirst(Node head) {

        Node newNode = new Node(50);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertNodeAtLast(Node head) {

    }

    public void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
