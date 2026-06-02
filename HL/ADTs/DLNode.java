/* 
 * Doubly-linked NODE definition
 */
public class DLNode {
	
    private int data;
    private DLNode prev; // link to previous node
    private DLNode next; // link to next node

    // Constructor to initialize a node with data (links default to null)
    public DLNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    // Constructor to initialize a node with data, prev, and next links
    public DLNode(int data, DLNode prev, DLNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    // Getter for data
    public int getData() {
        return data;
    }

    // Setter for data
    public void setData(int data) {
        this.data = data;
    }

    // Getter for the previous node
    public DLNode getPrev() {
        return prev;
    }

    // Setter for the previous node
    public void setPrev(DLNode prev) {
        this.prev = prev;
    }

    // Getter for the next node
    public DLNode getNext() {
        return next;
    }

    // Setter for the next node
    public void setNext(DLNode next) {
        this.next = next;
    }

    // toString method to cleanly represent the node's data
    @Override
    public String toString() {
        return " <- " + data + " -> ";
    }
}
