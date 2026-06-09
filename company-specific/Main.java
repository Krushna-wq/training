
// public class Main {
    
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class LinkedList {
//         Node head;

//         public void displayStartingPoint() {
//             if (head != null) {
//                 System.out.println("Starting Point (Head Node) Data: " + head.data);
//             } else {
//                 System.out.println("The list is empty.");
//             }
//         }

//         public void displayList() {
//             Node current = head;
//             System.out.print("Complete Linked List: ");
//             while (current != null) {
//                 System.out.print(current.data + " -> ");
//                 current = current.next;
//             }
//             System.out.println("null");
//         }
//     }

//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();

  
//         Node first = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);
//         Node fourth = new Node(40);
//         Node fifth = new Node(50);

//         list.head = first;

//         first.next = second;
//         second.next = third;
//         third.next = fourth;
//         fourth.next = fifth;

//         list.displayStartingPoint();
//         list.displayList();
//     }
// }
class Node {
    int data;
    Node nextloc;
  
    Node(int data) {
        this.data = data;
        this.nextloc = null;}
        public static void display(Node head) {

        Node current = head;

         while (current != null) {
            System.out.print(current.data);
            if (current.nextloc != null)
                System.out.print(" -: ");
            current = current.nextloc;
        }
        System.out.println(": null"); 

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.nextloc;
        }
    }
    }


public class Main {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.nextloc = node2;
        node2.nextloc = node3;
        node3.nextloc = node4;
        node4.nextloc = node5;
    Node head = node1;


        Node.display(head);
        
    }
}