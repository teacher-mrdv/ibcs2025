/*
 * Node.java
 * Defines a node to build a linked list
 * This is a blueprint / recipe / cookie cutter
 * user data type definition
 * 
 */


public class Node {
	
	private int data;	// our node is made of an integer data
	private Node next;	// reference to another Node

	// the special method below allows us to create a Node
	// and initialise it with an integer [Constructor]
	public Node(int n) {
		data = n;
		next = null;
	}

	/*
	public Node(int data) {
		this.data = data;
		next = null;
	} */

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String toString() {
		return data + " -> "; // converts the integer data to String
	}

}

