class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
	}
}

class BST {
	Node root;

	// JAVA GIVES YOU THIS BY DEFAULT!
	BST() {
		this.root = null;
	}

	void insert(int data) {		
		// If there is nothing to check in the first place, create the root then return.
		if (this.root == null) {
			this.root = newNode;
			return;
		}

		// We have a root.
		Node current = this.root;
	}

	private void recursiveInsert(Node current, int data) {
		// Assume root is not null.
		if (data < current.data) {
			// if the left, that we WANT is null
			if (current.left == null) {
				// make the node
				current.left = new Node(data);
				return; // end of recursion, go back
			} else {
				// Otherwise, recurse.
				recursiveInsert(current.left, data);
			}
		} else {
			// if the right, that we WANT, is null
			if (current.right == null) {
				current.right = new Node(data);
				return; // end of recursion, go back
			} else {
				// Recurse
				recursiveInsert(current.right, data);
			}
		}

	}
	
}


public class EasonBST {
	

	public static void main(String[] args) {
	}
}
