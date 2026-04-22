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
			System.out.print(current.getData() + " -> ");
			current = current.getNext(); // move to the next node
		}
		System.out.println("NULL");
	}

	public void append(Node newNode) {
		if( isEmpty() ) {
			head = newNode;
		} else {
			Node current = head;
			while( current.getNext() != null ) {
				current = current.getNext();
			}
			current.setNext(newNode);
		}
	}

	public void remove(int n) {
		if( !isEmpty() ) {
			if( head.getData() == n ) {
				head = head.getNext();
			} else {
				Node previous = head;
				Node current = head.getNext();
				while( current != null ) {
					if( current.getData() == n ) {
						previous.setNext(current.getNext());
						return;
					}
					previous = previous.getNext();
					current = current.getNext();
				}
			}
		}
	}

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.traversal();
		Node item = new Node(3); // we have to create/instantiate a node
		System.out.println( item.getData() );
		//System.out.println( item.getNext() );
		myList.append(item);
		item = new Node(5);			// and initialise its data with 5
		//System.out.println(myList.head.getData() );
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
		myList.append(new Node(2));
		myList.traversal();
		myList.append(new Node(0));
		myList.traversal();
	}
}

