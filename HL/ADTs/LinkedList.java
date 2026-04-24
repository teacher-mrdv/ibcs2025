/*
 * LinkedList.java			note:	LL=linked list
 * This class defines the content and structure of a linked list
 * We haven't encapsulated/hidden its data yet the way we did it with the Node class - WIP
 * 
 */


public class LinkedList {
	// point of access to the linked list: HEAD attribute
	Node head;
	// attribute to keep track of the SIZE (number of nodes) of the linked list
	int size = 0;

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

	// visit/go through each node and print its data
	public void traversal() { // AKA "printLinkedList" 
		/* this is redundant, but part of our thinking process
		if( isEmpty() ) {
			return; // exit if the ll is empty
		} */
		Node current = head;	// start at the head
		System.out.print("head -> ");
		while( current != null ) {
			System.out.print(current.getData() + " -> ");
			current = current.getNext(); // move to the next node
		}
		System.out.println("NULL\t| size = " + size);
	}
	
	// prints a visual representation of the linked list (same as traversal)
	public void printLinkedList() {
		Node current = head;	// start at the head
		System.out.print("head -> ");
		// process/traverse/iterate over each and every node
		while( current != null ) {
			System.out.print(current.getData() + " -> ");
			current = current.getNext(); // move to the next node
		}
		System.out.println("NULL\t| size = " + size);
	}

	// add a (new) node to the end of the linked list
	public void append(Node newNode) {
		// if the LL is empty, the new node becomes its head (start)
		if( isEmpty() ) {
			head = newNode;
		} else {
			// traverse the LL until we get to the last node...
			Node current = head;
			while( current.getNext() != null ) {
				current = current.getNext();
			}
			// ...then link the last node to the new node 
			current.setNext(newNode);
		}
		size++;
	}

	// search for a node with the value <n> and remove/delete from the linked list
	// the boolean return type is optional, this method could also be void
	public boolean remove(int n) {
		if( isEmpty() ) {
			System.out.println("Cannot remove from an empty list");
			return false;
		} else {
			// deleting the first node
			if( head.getData() == n ) {
				head = head.getNext();
				size--;
				System.out.println(n + " was removed from the list");
				return true;	// successful deletion!
			}
			Node previous = head;
			Node current = head.getNext();
			while( current != null ) {
				if( current.getData() == n ) {
					previous.setNext(current.getNext());
					size--;
					System.out.println(n + " was removed from the list");
					return true;// successful deletion!
				}
				// bypass/bridge
				previous = previous.getNext();
				current = current.getNext();
			}
		}
		return false;	// n was not found and therefore not removed
	}

	/* Challenge 0:
	 * removes the n-th element from the linked list.
	 * I assume the first element of the list to be 1, but...
	 * ...you may change the code if you prefer it to be 0
	 **/
	public boolean removeNth(int nth) {
		if( isEmpty() ) {
			System.out.println("Cannot remove from an empty list");
			return false;
		}
		if( nth < 1 || nth > size ) {
			System.out.println("Nth is out of range (1~size)");
			return false;
		}
		// delete the first node, the head
		if( nth == 1 ) {
			head = head.getNext();
			size--;
			return true;	// successful deletion!
		}
		// delete any other node in the list that is NOT the 1st/head
		Node previous = head;
		Node current = head.getNext();
		int counter = 1;
		// the counter has to stop at the penultimate node
		// so that current doesn't go past the end of the LL/null 
		while( counter < nth-1 ) {
			previous = previous.getNext();
			current = current.getNext();
			counter++;
		}
		previous.setNext(current.getNext());
		size--;
		return true;		// successful deletion!
	}
	
	/* Challenge 1:
	 * Construct a method to insert a new node AFTER
	 *  the n-th node of a linked list, and add code to test it
	 *  in the LinkedList class.
	 */
	
	
	
	/* Challenge 2:
	 * Construct a method to insert a new node BEFORE
	 *  the n-th node of a linked list, and add code to test it
	 *  in the LinkedList class.
	 */



}

