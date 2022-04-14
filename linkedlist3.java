// remove first node from the linked list and update the list.

// first create the linkedlist class
public class linkedlist3 {
    Node head; // head of the linked list
    Node tail;
    // defining the node class
    // node class will be declared as static so that main can access it

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void addNodelast(int value) {
        Node newNode = new Node(value);

        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }
    }

    public void display() {
        // Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteFromStart() {

        // Checks if the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            // Checks whether the list contains only one node
            // If not, the head will point to next node in the list and tail will point to
            // the new head.
            if (head != tail) {
                head = head.next;
            }
            // If the list contains only one node
            // then, it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist3 list3 = new linkedlist3();
        list3.addNodelast(23);
        list3.addNodelast(67);
        list3.addNodelast(78);
        list3.addNodelast(12);
        list3.addNodelast(56);

        System.out.println("\n original list:");
        list3.display();

        while (list3.head != null) {
            list3.deleteFromStart();

            System.out.println("\n updated list:");
            list3.display();
        }
    }
}