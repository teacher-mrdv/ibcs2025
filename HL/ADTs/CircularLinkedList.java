public class CircularLinkedList {
    // We only need a reference to the head (start) of the list
    private Node head;

    // Constructor to initialize an empty list
    public CircularLinkedList() {
        this.head = null;
    }

    // 1. ADD / INSERT a node at the end of the list
    public void add(Node newNode) {
        // Case 1: If the list is empty, the new node becomes the head 
        // and points to itself to make it circular
        if (head == null) {
            head = newNode;
            head.setNext(head); 
            System.out.println("Added " + newNode.getData() + " as the head.");
            return;
        }

        // Case 2: If the list already has nodes, travel to the last node
        Node temp = head;
        // In a circular list, the last node is the one pointing to the head
        while (temp.getNext() != head) {
            temp = temp.getNext();
        }

        // Link the old last node to the new node
        temp.setNext(newNode);
        // Link the new node back to the head to maintain the circle
        newNode.setNext(head);
        System.out.println("Added " + newNode.getData() + " to the list.");
    }

    // 2. SEARCH for a value in the list
    public boolean search(int value) {
        if (head == null) {
            return false; // Can't search an empty list
        }

        Node temp = head;
        // We use a do-while loop because temp starts at head. 
        // A regular while(temp != head) loop would immediately exit!
        do {
            if (temp.getData() == value) {
                return true; // Found the value!
            }
            temp = temp.getNext();
        } while (temp != head); // Stop once we've looped completely back to head

        return false; // Traveled the whole circle and didn't find it
    }

    // 3. DELETE a node with a specific value
    public boolean delete(int value) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return false;
        }
		
        // Case 1: The node to delete is the HEAD node
        if (head.getData() == value) {
            // Sub-case A: It is the ONLY node in the list
            if (head.getNext() == head) {
                head = null;
            } else {
                // Sub-case B: Multi-node list. Find the last node to update its pointer.
                Node tail = head;
                while (tail.getNext() != head) {
                    tail = tail.getNext();
                }
                // Move head to the next node
                head = head.getNext();
                // Fix the tail to point to the new head
                tail.setNext(head);
            }
            System.out.println("Deleted head node (" + value + ").");
            return true;
        }

        // Case 2: The node to delete is a middle or last node
        Node current = head;
        Node previous = null;
        
        do {
            previous = current;
            current = current.getNext();
            
            if (current.getData() == value) {
                // Bypass the current node by linking previous straight to current's next
                previous.setNext(current.getNext());
                System.out.println("Deleted node (" + value + ").");
                return true;
            }
        } while (current != head);

        System.out.println("Value " + value + " not found.");
        return false;
    }
    
    // 5. DELETE the Nth node (assuming the first element is 'index'/place 1)
    public boolean deleteNth(int n) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return false;
        }

        // Step A: Calculate the total number of nodes in the list
        int size = 0;
        Node temp = head;
        do {
            size++;
            temp = temp.getNext();
        } while (temp != head);

        // Step B: Validate if 'n' falls within bounds
        if (n <= 0 || n > size) {
            System.out.println("Position " + n + " is out of bounds. (List size is " + size + ")");
            return false;
        }

        // Case 1: Deleting the 1st node (the head node)
        if (n == 1) {
            int deletedValue = head.getData();
            if (head.getNext() == head) {
                head = null; // List had only one element, now it's empty
            } else {
                // Find the tail node to update its pointer to the new head
                Node tail = head;
                while (tail.getNext() != head) {
                    tail = tail.getNext();
                }
                head = head.getNext(); // Advance head
                tail.setNext(head);    // Re-link circle
            }
            System.out.println("Deleted 1st node (" + deletedValue + ").");
            return true;
        } 
        
        // Case 2: Deleting a middle or last node
        else {
            Node current = head;
            // Advance until 'current' sits exactly BEFORE the node to delete
            for (int i = 1; i < n - 1; i++) {
                current = current.getNext();
            }
            
            Node nodeToDelete = current.getNext();
            int deletedValue = nodeToDelete.getData();
            
            // Bypass the target node
            current.setNext(nodeToDelete.getNext());
            
            System.out.println("Deleted node at position " + n + " (" + deletedValue + ").");
            return true;
        }
    }

    // 4. PRINT the entire circular list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.print("head -> ");
        do {
            // Uses your Node's toString() method which prints "data -> "
            System.out.print(temp.toString()); 
            temp = temp.getNext();
        } while (temp != head);
        
        // Visual indicator showing it goes back to the start
        System.out.println("(head)");
    }
    

    public static void main(String[] args) {
        // Create an instance of our Circular Linked List
        CircularLinkedList myList = new CircularLinkedList();
        Node nuevo;

        System.out.println("--- 1. Testing Adding Nodes ---");
        nuevo = new Node(10); myList.add(nuevo);
        nuevo = new Node(20); myList.add(nuevo);
        nuevo = new Node(30); myList.add(nuevo);
        nuevo = new Node(40); myList.add(nuevo);
        
        // Print the list to see it in action
        myList.printList();
        System.out.println();

        System.out.println("--- 2. Testing Searching ---");
        int searchTarget1 = 30;
        int searchTarget2 = 99;
        
        System.out.println("Is " + searchTarget1 + " in the list? " + myList.search(searchTarget1));
        System.out.println("Is " + searchTarget2 + " in the list? " + myList.search(searchTarget2));
        System.out.println();

        System.out.println("--- 3. Testing Deletion (Middle Node) ---");
        myList.delete(30); // Deleting a middle node
        myList.printList();
        System.out.println();

        System.out.println("--- 4. Testing Deletion (Head Node) ---");
        myList.delete(10); // Deleting the head node (20 should become the new head)
        myList.printList();
        System.out.println();

        System.out.println("--- 5. Testing Deletion (Non-existent Node) ---");
        myList.delete(100);
        myList.printList();
        
        System.out.println("\n--- Regenerating our list ---");
        myList = new CircularLinkedList(); // clear it
        nuevo = new Node(10); myList.add(nuevo);
        nuevo = new Node(20); myList.add(nuevo);
        nuevo = new Node(30); myList.add(nuevo);
        nuevo = new Node(40); myList.add(nuevo);
        nuevo = new Node(50); myList.add(nuevo);
        
        myList.printList();
        System.out.println();

        System.out.println("--- 6. Testing Deletion of a Middle Node (Position 3) ---");
        myList.deleteNth(3); // Should delete '30'
        myList.printList();  // head -> 10 -> 20 -> 40 -> 50 -> (head)
        System.out.println();

        System.out.println("--- 7. Testing Deletion of the Last Node (Position 4) ---");
        myList.deleteNth(4); // Current size is 4, so this deletes '50'
        myList.printList();  // head -> 10 -> 20 -> 40 -> (head)
        System.out.println();

        System.out.println("--- 8. Testing Deletion of the Head Node (Position 1) ---");
        myList.deleteNth(1); // Deletes '10', '20' becomes new head
        myList.printList();  // head -> 20 -> 40 -> (head)
        System.out.println();

        System.out.println("--- 9. Testing Out of Bounds Deletion ---");
        myList.deleteNth(99); // Invalid position
        myList.deleteNth(0);  // Invalid position
        myList.printList();
    }

}
