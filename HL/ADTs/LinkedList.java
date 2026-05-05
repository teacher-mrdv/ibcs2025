/*
 * LinkedList.java			note:	LL=linked list
 * This class defines the content and structure of a linked list
 * Now fully encapsulated (+data hiding)
 * 
 */


public class LinkedList {
	// point of access to the linked list: HEAD attribute
	private Node head;
	// attribute to keep track of the SIZE (number of nodes) of the linked list
	private int size = 0;

	// custom constructor (it takes a parameter)
	// Creates a linked list with a head (1 node)
	public LinkedList(Node head) {
		this.head = head;
		size = 1;
	}

	// empty constructor (instantiates an EMPTY linked list
	public LinkedList() {
		head = null;
		size = 0;
	}
	
	public Node getHead() {
		return head;
	}

	public int getSize() {
		return size;
	}

	public int size() {
		return size;
	}

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
     * Construct a method to clone (copy) a linked list to a new LL
     * Just like we did with arrays, you will need to create a new LL,
     *  and copy one node at a time.
     */
    public LinkedList clone() {
        LinkedList newList = new LinkedList(); // Always create the object

        if (!this.isEmpty()) {
            Node current = this.getHead();
            while (current != null) {
                // Create a new node with the same data
                Node newNode = new Node(current.getData());
                // Add it to the new list
                newList.append(newNode);
                // move to next node
                current = current.getNext();
            }
        }
        return newList;
    }
	
	/* Challenge 2:
	 * Construct a method to insert a new node AFTER
	 *  the n-th node of a linked list (place), and
	 *  add code to test itn the LinkedList class.
	 */
	public void insertAfter(Node insert, int place) {
		if(place < 1 || place > this.size()) {
			System.out.println("ERROR - insertAfter " + place + " out of bounds!");
			return;
		}
		if( place == 1 ) {
			insert.setNext( head.getNext() );
			head.setNext(insert);
			size++;
		} else {
			int counter = 1;
			Node temp = this.head;
			while(counter < place) {
				temp = temp.getNext();
				counter++;
			}
			insert.setNext(temp.getNext());
			temp.setNext(insert);
			size++;
		}
	}

	
	/* Challenge 3:
	 * Construct a method to insert a new node BEFORE
	 *  the n-th node of a linked list (place), and
	 *  add code to test it in the LinkedList class.
	 */
	public void insertBefore(Node insert, int place)
	{	if(place < 1 || place > this.size()) {
			System.out.println("ERROR - insertBefore " + place + " out of bounds!");
			return;
		}
		if(place == 1) {
			insert.setNext(head);
			head = insert;
			size++;
			return;
		}
		int counter = 1;
		Node temp = head;
		while(counter < place-1) {
			temp = temp.getNext();
			counter++;
		}
		insert.setNext(temp.getNext());
		temp.setNext(insert);
		size++;
	}

	/* returns a String representation of the LL.
	 * Similar to printLinkedList(), but returns a String
	 * rather than printing it directly to the screen.
	 * This method is called by System.out.print/println(),
	 * allowing us to "print" a LL directly.
	 */
	public String toString() {
		Node current = head;	// start at the head
		String output = "head -> ";
		// process/traverse/iterate over each and every node
		while( current != null ) {
			output = output + current.getData() + " -> ";
			current = current.getNext(); // move to the next node
		}
		output += "NULL\t| size = " + size;
		return output;
	}


}

