public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList myList = new LinkedList();
		myList.traversal();
		Node item = new Node(3); // create/instantiate a node using the constructor we coded in Node.java
		System.out.println( item.getData() );
		myList.append(item);
		item = new Node(5);
		myList.append(item);
		myList.traversal();
		item = new Node(1);
		myList.append(item);
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
		 
		myList.remove(3);
		myList.traversal();
		myList.remove(0);
		myList.traversal();
		myList.remove(7);
		myList.traversal();
		
		/* comment/uncomment the remove methods to test them
		myList.removeNth(5);
		myList.traversal();
		myList.removeNth(1);
		myList.traversal();
		myList.removeNth(myList.size);
		myList.traversal();
		*/
	}
	
}

