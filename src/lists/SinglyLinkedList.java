package lists;

public class SinglyLinkedList<E> {
	Node<E> head;

	// Parameterless constructor
	SinglyLinkedList() {

	}

	// Constructor with parameter to initialize head node
	SinglyLinkedList(E data) {
		head = new Node<E>(data);
	}

	// Adding node to list
	void addNode(Node<E> newNode) {
		// Create Node variable to store Nodes as we traverse list
		Node<E> traversalNode = head;

		// Traverse list until very last node (that is, the Node object with null
		// instance variable called next
		while (traversalNode.next != null) {
			traversalNode = traversalNode.next;
		}
		
		//Once you are at last node, add new node as tail 
		traversalNode.next = newNode;
		
		
	}
	
	
}

class Node<E> {
	Node(E data) {
		this.data = data;
	}

	E data;
	Node<E> next;
}
