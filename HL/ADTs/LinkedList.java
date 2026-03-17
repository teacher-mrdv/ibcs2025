/*
 * LinkedList.java
 * This class defines the content and structure
 * of a linked list
 * 
 */


public class LinkedList {
	Node head;

	public boolean isEmpty() {
		return head == null;
		/*
			if(head == null) {
				return true;
			} else {
				return false;
			}
		*/
	}

	public void traversal() { // AKA "printLinkedList" 
		/* this is redundant, but part of our thinking process
		if( isEmpty() ) {
			return; // exit if the ll is empty
		} */
		Node current = head;	// start at the head
		System.out.print("head -> ");
		while( current != null ) {
			System.out.print(current.data + " -> ");
			current = current.next; // move to the next node
		}
		System.out.println("NULL");
	}

	public void append(Node newNode) {
		if( isEmpty() ) {
			head = newNode;
		} else {
			Node current = head;
			while( current.next != null ) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		Node item = new Node(); // we have to create/instantiate a node
		item.data = 5;			// and initialise its data with 5
		myList.append(item);
		myList.traversal();
		item = new Node(3);		// instantiate and initialise a node
		myList.append(item);	// using the constructor we coded in Node.java
		myList.traversal();
		item = new Node(9);
		myList.append(item);
		myList.traversal();
		item = new Node(7);
		myList.append(item);
		myList.traversal();
	}
}

