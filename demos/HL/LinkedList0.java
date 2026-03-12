class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
};

public class LinkedList0
{	
	public static void main (String[] args)
	{
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);

		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = null;

		Node temp = first;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
		
	}
}

