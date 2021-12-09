package lists;

public class SinglyLinkedList<E> {
	private Node head;
	private int size = 0;
	private boolean isEmpty = true;

	// Parameterless constructor
	SinglyLinkedList() {

	}

	// Constructor with parameter to initialize head node
	SinglyLinkedList(E data) {
		head = new Node(data);
		size++;
		isEmpty = false;
	}

	// Adding node to list
	void add(E... dataVarArg) {
		
		//Perform add operation for each argument provided

		for (E data : dataVarArg) {
			Node newNode = new Node(data);

			if (isEmpty) {
				// If list is empty, simply make new node the head node
				head = newNode;

				// Update information
				isEmpty = false;

			} else {

				// Create Node variable to store nodes as we traverse list
				Node traversalNode = head;

				// Traverse list until very last node (that is, the Node object with null
				// instance variable called next
				while (traversalNode.next != null) {
					traversalNode = traversalNode.next;
				}

				// Once you are at last node, add new node as tail
				traversalNode.next = newNode;
			}

			// Increase size
			size++;
		}

	}

	// Remove node from list. Remove first node with given data
	void remove(E... dataVarArg) {

		//Perform remove operation for each argument provided
		argIteration: for (E data : dataVarArg) {

			// Account for when list is empty
			if (isEmpty) {
				System.out.println("List is empty. Nothing to remove.");
				//Stop iterating through arguments
				break argIteration;
			}

			// Account for when there is only one element in list
			if (size == 1) {
				if (head.data == data) {
					head = null;

					// Update information about list
					isEmpty = true;
					size--;

				} else {
					System.out.println(data + " is not in list.");
				}

				// Continue iterating through arguments
				continue argIteration;
			}

			Node traversalNode = head;
			Node traversalNode2 = head.next;

			
			// Account for when there are 2 or more elements and first is a match
			if(traversalNode.data == data) {
				head = traversalNode2;
				
				// Update information about list
				size--;

				
				// Continue iterating through arguments
				continue argIteration;
			}
			
			
			// Iterate through list
			for (int i = 0; i < size; i++) {

				// Check if data of node matches what you are looking for
				if (traversalNode2.data == data) {

					// NullPointerException? But it is not being used, just assigned.
					traversalNode2.next = traversalNode2.next;

					// Update information about list
					size--;

					// Continue iterating through arguments
					continue argIteration;

				} else {

					Node temp = traversalNode2.next;
					traversalNode = traversalNode2;
					traversalNode2 = temp;
				}

			}

			// If no such element exists
			System.out.println(data + "is not in list.");
		}
	}

	@Override
	public String toString() {
		// String you will concatenate members to and return.
		String myList = "SinglyLinkedList: \n\t";

		// Create Node variable to store nodes as we traverse list
		Node traversalNode = head;

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
			return myList;
			
		}else {
			return myList + "[[empty]]";
		}

		// Return String representation of linked list

		
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
