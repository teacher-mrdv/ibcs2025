/*
 * This class tests the LinkedList [OOP] class
 * 5.May.26
 */
 
public class LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList myList = new LinkedList();
		myList.printLinkedList();
		Node item = new Node(3); // create/instantiate a node using the constructor we coded in Node.java
		System.out.println( "Node item: item.data = " + item.getData() + "; item.next = " + item.getNext() );
		myList.append(item);
		item = new Node(5);
		myList.append(item); myList.printLinkedList();
		item = new Node(1);
		myList.append(item); myList.printLinkedList();
		item = new Node(9);
		myList.append(item); myList.printLinkedList();
		item = new Node(7);

		myList.append(item);
		myList.traversal();
		myList.append(new Node(2));
		myList.traversal();
		myList.append(new Node(0));
		myList.traversal();
		
		LinkedList yourList = new LinkedList();
		yourList = myList.clone();

		System.out.println("\nremoving 3, 0, 7 from myList:");
		myList.remove(3); myList.printLinkedList();
		myList.remove(0); myList.printLinkedList();
		myList.remove(7); myList.printLinkedList();

		System.out.println("\nyourlist (cloned): ");
		yourList.printLinkedList();
		System.out.println("removing 5th, 1st, and last nodes from yourList:");
		yourList.removeNth(5);
		yourList.printLinkedList();
		yourList.removeNth(1);
		yourList.printLinkedList();
		yourList.removeNth(yourList.getSize());
		yourList.printLinkedList();
		
		/* using the insertBefore and insertAfter methods,
		 * construct code here to restore the items we deleted from
		 * myList and yourList.
		 */

		System.out.println();
		Node restore = new Node(3);
		myList.insertBefore(restore, 1);
		System.out.println("myList.insertBefore(restore, 1);\n" + myList);
		restore = new Node(7);
		myList.insertBefore(restore, 5);
		System.out.println("myList.insertBefore(restore, 5);\n" + myList);
		restore = new Node(0);
		myList.insertAfter(restore, 6);
		System.out.println("myList.insertAfter(restore, 6);\n" + myList);

		System.out.println();
		restore = new Node(3);
		yourList.insertBefore(restore, 1);
		System.out.println("yourList.insertBefore(restore, 1);\n" + yourList);
		restore = new Node(7);
		yourList.insertAfter(restore, 4);
		System.out.println("yourList.insertAfter(restore, 4);\n" + yourList);
		restore = new Node(0);
		yourList.insertAfter(restore, 6);
		System.out.println("yourList.insertAfter(restore, 6);\n" + yourList);

		System.out.println("yourList.search(12) = " + yourList.search(12) );
		System.out.println("yourList.search(3) = " + yourList.search(3) );
		System.out.println("yourList.search(1) = " + yourList.search(1) );
		System.out.println("yourList.search(0) = " + yourList.search(0) );

		System.out.println("yourList.searchPlace(12) = " + yourList.searchPlace(12) );
		System.out.println("yourList.searchPlace(3) = " + yourList.searchPlace(3) );
		System.out.println("yourList.searchPlace(1) = " + yourList.searchPlace(1) );
		System.out.println("yourList.searchPlace(0) = " + yourList.searchPlace(0) );

	}
	
}

/* OUTPUT (expected)

head -> NULL    | size = 0
Node item: item.data = 3; item.next = null
head -> 3 -> 5 -> NULL  | size = 2
head -> 3 -> 5 -> 1 -> NULL     | size = 3
head -> 3 -> 5 -> 1 -> 9 -> NULL        | size = 4
head -> 3 -> 5 -> 1 -> 9 -> 7 -> NULL   | size = 5
head -> 3 -> 5 -> 1 -> 9 -> 7 -> 2 -> NULL      | size = 6
head -> 3 -> 5 -> 1 -> 9 -> 7 -> 2 -> 0 -> NULL | size = 7

removing 3, 0, 7 from myList:
3 was removed from the list
head -> 5 -> 1 -> 9 -> 7 -> 2 -> 0 -> NULL      | size = 6
0 was removed from the list
head -> 5 -> 1 -> 9 -> 7 -> 2 -> NULL   | size = 5
7 was removed from the list
head -> 5 -> 1 -> 9 -> 2 -> NULL        | size = 4

yourlist (cloned):
head -> 3 -> 5 -> 1 -> 9 -> 7 -> 2 -> 0 -> NULL | size = 7
removing 5th, 1st, and last nodes from yourList:
head -> 3 -> 5 -> 1 -> 9 -> 2 -> 0 -> NULL      | size = 6
head -> 5 -> 1 -> 9 -> 2 -> 0 -> NULL   | size = 5
head -> 5 -> 1 -> 9 -> 2 -> NULL        | size = 4

myList.insertBefore(restore, 1);
head -> 3 -> 5 -> 1 -> 9 -> 2 -> NULL   | size = 5
myList.insertBefore(restore, 5);
head -> 3 -> 5 -> 1 -> 9 -> 7 -> 2 -> NULL      | size = 6
myList.insertAfter(restore, 6);
head -> 3 -> 5 -> 1 -> 9 -> 7 -> 2 -> 0 -> NULL | size = 7

yourList.insertBefore(restore, 1);
head -> 3 -> 5 -> 1 -> 9 -> 2 -> NULL   | size = 5
yourList.insertAfter(restore, 4);
head -> 3 -> 5 -> 1 -> 9 -> 7 -> 2 -> NULL      | size = 6
yourList.insertAfter(restore, 6);
head -> 3 -> 5 -> 1 -> 9 -> 7 -> 2 -> 0 -> NULL | size = 7

*/
