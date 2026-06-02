public class DoublyLinkedList {
    // We only need a reference to the head (start) of the list
    private DLNode head;

    // Constructor to initialize an empty list
    public DoublyLinkedList() {
        this.head = null;
    }

    // 1. ADD / INSERT a node at the end of the list
    public void add(DLNode newNode) {
        // Case 1: If the list is empty, the new node becomes the head
        if (head == null) {
            head = newNode;
            System.out.println("Added " + newNode.getData() + " as the head.");
            return;
        }

        // Case 2: Travel to the last node
        DLNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        // Link the old last node forward to the new node
        temp.setNext(newNode);
        // Link the new node backward to the old last node
        newNode.setPrev(temp);
        
        System.out.println("Added " + newNode.getData() + " to the list.");
    }

    // 2. SEARCH for a value in the list
    public boolean search(int value) {
        DLNode temp = head;
        
        // Walk through the list until we hit the end (null)
        while (temp != null) {
            if (temp.getData() == value) {
                return true; // Found it!
            }
            temp = temp.getNext();
        }
        return false; // Iterated through the whole list without finding it
    }

    // 3. DELETE a node with a specific value
    public boolean delete(int value) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return false;
        }

        DLNode current = head;

        // Traverse to find the matching node
        while (current != null) {
            if (current.getData() == value) {
                
                // Case 1: The node to delete is the HEAD node
                if (current == head) {
                    head = head.getNext(); // Move head forward
                    if (head != null) {
                        head.setPrev(null); // Sever link to old head
                    }
                } 
                // Case 2: The node to delete is a middle or last node
                else {
                    // Route the previous node's next pointer around 'current'
                    current.getPrev().setNext(current.getNext());
                    
                    // If it's NOT the last node, route the next node's prev pointer backward around 'current'
                    if (current.getNext() != null) {
                        current.getNext().setPrev(current.getPrev());
                    }
                }
                System.out.println("Deleted node (" + value + ").");
                return true;
            }
            current = current.getNext();
        }

        System.out.println("Value " + value + " not found.");
        return false;
    }

    // 4. DELETE the Nth node (1-indexed)
    public boolean deleteNth(int n) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return false;
        }

        // Step A: Calculate the total size of the list
        int size = 0;
        DLNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.getNext();
        }

        // Step B: Validate if 'n' falls within bounds
        if (n <= 0 || n > size) {
            System.out.println("Position " + n + " is out of bounds. (List size is " + size + ")");
            return false;
        }

        // Case 1: Deleting the 1st node (head)
        if (n == 1) {
            int deletedValue = head.getData();
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            }
            System.out.println("Deleted 1st node (" + deletedValue + ").");
            return true;
        }

        // Case 2: Deleting any subsequent node
        DLNode current = head;
        // Advance current until it points directly to the target node to delete
        for (int i = 1; i < n; i++) {
            current = current.getNext();
        }

        int deletedValue = current.getData();
        
        // Link the node before current directly to the node after current
        current.getPrev().setNext(current.getNext());
        
        // If it is not the last node, update the backward link as well
        if (current.getNext() != null) {
            current.getNext().setPrev(current.getPrev());
        }

        System.out.println("Deleted node at position " + n + " (" + deletedValue + ").");
        return true;
    }

    // 5. PRINT the list from front to back
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        DLNode temp = head;
        System.out.print("head -> ");
        while (temp != null) {
            // Uses your custom DLNode toString() layout which appends " -> "
            System.out.print(temp.toString());
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    // BONUS METHOD: Print backward to prove the 'prev' links actually work!
    public void printBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Go to the end of the list first
        DLNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        // Walk backward using getPrev()
        System.out.print("tail -> ");
        while (temp != null) {
            System.out.print(temp);
            temp = temp.getPrev();
        }
        System.out.println("null (head)");
    }
    
    
    
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        DLNode nuevo;

        System.out.println("--- 1. Testing Adding Nodes ---");
        nuevo = new DLNode(10); myList.add(nuevo);
        nuevo = new DLNode(20); myList.add(nuevo);
        nuevo = new DLNode(30); myList.add(nuevo);
        nuevo = new DLNode(40); myList.add(nuevo);
        nuevo = new DLNode(50); myList.add(nuevo);
        
        System.out.print("Forward "); myList.printList();    // 10 -> 20 -> 30 -> 40 -> 50
        System.out.print("Backward "); myList.printBackward(); // 50 -> 40 -> 30 -> 20 -> 10
        System.out.println();

        System.out.println("--- 2. Testing Searching ---");
        int target = 30;
        System.out.println("Is " + target + " in the list? " + myList.search(target));
        System.out.println("Is 99 in the list? " + myList.search(99));
        System.out.println();

        System.out.println("--- 3. Testing Deletion by Value (Middle Node) ---");
        myList.delete(30); // Drops 30
        myList.printList();
        System.out.println();

        System.out.println("--- 4. Testing Deletion of Nth Node (Position 3) ---");
        myList.deleteNth(3); // Current sequence is [10, 20, 40, 50]. Position 3 is 40.
        myList.printList();  // Should show: 10 -> 20 -> 50 -> null
        System.out.println();

        System.out.println("--- 5. Testing Deletion of Nth Node (Position 1 - Head) ---");
        myList.deleteNth(1); // Drops 10. 20 becomes the new head.
        myList.printList();
        System.out.println();
        
        System.out.println("--- 6. Verification Check via Backward Print ---");
        // Printing backward forces the code to use the rewritten '.getPrev()' links 
        // to prove no lingering memory references are broken.
        myList.printBackward();
    }

}
