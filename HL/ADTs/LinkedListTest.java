public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList myList = new LinkedList();
		myList.traversal();
		Node item = new Node(3); // create/instantiate a node using the constructor we coded in Node.java
		System.out.println( "Node item: item.data = " + item.getData() + "; item.next = " + item.getNext() );
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
		
		LinkedList yourList = new LinkedList();
		yourList.clone(myList);
		 
		myList.remove(3);
		myList.traversal();
		myList.remove(0);
		myList.traversal();
		myList.remove(7);
		myList.traversal();
		
		yourList.removeNth(5);
		yourList.traversal();
		yourList.removeNth(1);
		yourList.traversal();
		yourList.removeNth(myList.size);
		yourList.traversal();
		
		/* using the insertBefore and insertAfter methods,
		 * construct code here to restore the items we deleted from
		 * myList and yourList.
		 */
		
	}
	
}

/* OUTPUT (so far)
3
head -> 3 -> 5 -> NULL  | size = 2
head -> 3 -> 5 -> 1 -> NULL     | size = 3
head -> 3 -> 5 -> 1 -> 9 -> NULL        | size = 4
head -> 3 -> 5 -> 1 -> 9 -> 7 -> NULL   | size = 5
head -> 3 -> 5 -> 1 -> 9 -> 7 -> 2 -> NULL      | size = 6
head -> 3 -> 5 -> 1 -> 9 -> 7 -> 2 -> 0 -> NULL | size = 7
3 was removed from the list
head -> 5 -> 1 -> 9 -> 7 -> 2 -> 0 -> NULL      | size = 6
0 was removed from the list
head -> 5 -> 1 -> 9 -> 7 -> 2 -> NULL   | size = 5
7 was removed from the list
head -> 5 -> 1 -> 9 -> 2 -> NULL        | size = 4

*/
