package linearDataStructures;

public class SinglyLinkedList<E> {
	private Node head;
	private int size = 0;
	private boolean isEmpty = true;

	// Adding node to list
	public void add(E data) {

		// Perform add operation for each argument provided

		Node newNode = new Node(data);

		if (isEmpty) {
			// If list is empty, simply make new node the head node
			head = newNode;

		} else {

			// Create Node variable to store nodes as we traverse list
			Node traversalNode = head;

			// Traverse list until very last node (that is, the Node object with null
			// instance variable called next)
			while (traversalNode.next != null) {
				traversalNode = traversalNode.next;
			}

			// Once you are at last node, add new node as tail
			traversalNode.next = newNode;
		}

		// Increase size
		setSize(size + 1);

	}

	// Remove node from list. Remove first node with given data
	public void remove(E data) {

		// Account for when list is empty
		if (isEmpty) {
			System.out.println("List is empty. Nothing to remove.");

			return;
		}

		// Account for when there is only one element in list
		if (size == 1) {
			if (head.data == data) {
				head = null;

				// Update information about list

				setSize(size - 1);

			} else {
				System.out.println(data + " is not in list.");
			}

			return;
		}

		Node traversalNode = head;
		Node traversalNode2 = head.next;

		// Account for when there are 2 or more elements and first is a match
		if (traversalNode.data == data) {
			head = traversalNode2;

			// Update information about list
			setSize(size - 1);

			return;
		}

		// Iterate through list
		for (int i = 0; i < size - 1; i++) {

			// Check if data of node matches what you are looking for
			if (traversalNode2.data == data) {

				traversalNode.next = traversalNode2.next;

				// Update information about list
				setSize(size - 1);

				return;

			} else {

				Node temp = traversalNode2.next;
				traversalNode = traversalNode2;
				traversalNode2 = temp;
			}

		}

		// If no such element exists
		System.out.println(data + " is not in list.");

	}

	public void print() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		// String you will concatenate members to and return.
		String myList = "SinglyLinkedList [";

		// Create Node variable to store nodes as we traverse list
		Node traversalNode = head;

		// If list is not empty, traverse list, convert each node data into String
		// object, concatenate
		if (!isEmpty) {
			for (int i = 0; i < size; i++) {
				myList += traversalNode;
				if (traversalNode.next != null) {
					myList += "-> ";
					traversalNode = traversalNode.next;
				}

			}
			myList += "]";
			return myList;

		} else {
			return myList + "[[empty]]";
		}

		// Return String representation of linked list

	}

	// Get size operation
	public int getSize() {
		return size;
	}

	// Set size operation
	public void setSize(int size) {
		this.size = size;
		if (size == 0) {
			isEmpty = true;
		} else {
			isEmpty = false;
		}
	}

	private class Node {

		Node(E data) {
			this.data = data;
		}

		E data;
		Node next;

		@Override
		public String toString() {
			// Return data member converted to String
			return String.valueOf(data);
		}

	}

}