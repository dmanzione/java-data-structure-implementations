package lists;

public class SinglyLinkedList<E> {
	private Node<E> head;
	private int size = 0;
	private boolean isEmpty = true;

	// Parameterless constructor
	SinglyLinkedList() {

	}

	// Constructor with parameter to initialize head node
	SinglyLinkedList(E data) {
		head = new Node<E>(data);
		size++;
		isEmpty = false;
	}

	// Adding node to list
	void addNode(E data) {
		Node<E> newNode = new Node<E>(data);

		// Create Node variable to store nodes as we traverse list
		Node<E> traversalNode = head;

		// Traverse list until very last node (that is, the Node object with null
		// instance variable called next
		while (traversalNode.next != null) {
			traversalNode = traversalNode.next;
		}

		// Once you are at last node, add new node as tail
		traversalNode.next = newNode;

		// Increase size
		size++;

	}

	@Override
	public String toString() {
		// String you will concatenate members to and return.
		String myList = "SinglyLinkedList: \n\t";

		// Create Node variable to store nodes as we traverse list
		Node<E> traversalNode = head;

		// If list is not empty, traverse list, convert each node data into String
		// object, concatenate
		if (!isEmpty) {
			for (int i = 0; i < size; i++) {
				myList += traversalNode;
				if (i < size - 1) {
					myList += "-> ";
				}
				traversalNode = traversalNode.next;
			}
		}

		// Return String representation of linked list

		return myList;
	}

}

class Node<E> {

	Node(E data) {
		this.data = data;
	}

	E data;
	Node<E> next;

	@Override
	public String toString() {
		// Return data member converted to String
		return String.valueOf(data);
	}

}
