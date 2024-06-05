class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head; 
    public SinglyLinkedList() {
        this.head = null;
    }

    
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); 
        newNode.next = head;
        head = newNode; 
    }

    public void display() {
        Node current = head; 
        while (current != null) {
            System.out.print(current.data + " -> "); 
            current = current.next; 
        }
        System.out.println("null"); 
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(10); 
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.display();
    }
}
