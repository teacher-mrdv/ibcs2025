class Node {
	int data;
	Node next;

	Node(int data) { this.data = data; }
}

public class CircularLinkedList {
	static Node makeCirclularLinkedList(int a[]) {
		Node head = null, cur = null, temp = null;
		
		for (int i = 0; i < a.length; i++) {
			temp = new Node(a[i]);
			if (head == null) {
				head = temp;
				cur = temp;
			} else {
				cur.next = temp;
				cur = cur.next;
			}
		}

		// must link up the first and last
		// cur contains the very last one we added,
		// head contains the first one we made
		cur.next = head; // now it's circular
		return head;
	}

	static void traverseCircular(Node head, int count) {
		Node temp = head;
		for (int i = 0; i < count; ++i) {
			System.out.printf("cur: %d\n", temp.data);
			temp = temp.next;
		}		
	}
		
	public static void main(String[] args) {
		int[] items = {6,7,8,9,10};
		Node head = makeCirclularLinkedList(items);
		traverseCircular(head, 10);
	}
	
}
