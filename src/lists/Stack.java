package lists;

public class Stack<E> {

	private boolean isEmpty = true;
	private int size = 0;
	private Node top;

	// Parameterless constructor
	Stack() {

	}

	// Constructor with parameters
	Stack(E data) {
		top = new Node(data);
		isEmpty = false;
		//Update size
		setSize(size + 1);
	}

	public void push(E data) {
		Node newNode = new Node(data);

		if (!isEmpty) {
			top.next = newNode;
			newNode.previous = top;
		}

		top = newNode;
		
		//Update size
		setSize(size + 1);
	}

	public E pop() throws EmptyDataStructureException {
		if (isEmpty) {
			throw new EmptyDataStructureException("Stack");
		} else {
			E poppedVal = top.data;
			if (size == 1) {

				top = null;

			} else {

				top = top.previous;
				top.next = null;

			}
			//Update size
			setSize(size - 1);
			return poppedVal;
		}
	}

	public E peek() throws EmptyDataStructureException {
		if (isEmpty)
			throw new EmptyDataStructureException("Stack");
		else
			return top.data;
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
		E data;
		Node next;
		Node previous;

		Node(E data) {
			this.data = data;
		}

	}
}
