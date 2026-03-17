/*
 * Node.java
 * Defines a node to build a linked list
 * This is a blueprint / recipe / cookie cutter
 * user data type definition
 * 
 */


public class Node {
	int data;	// our node is made of an integer data
	Node next;	// reference to another Node

	// the special method below allows us to create a Node
	// and initialise it with an integer [Constructor]
	public Node(int n) {
		data = n;
		next = null;
	}

	public Node() {} // empty constructor

}

