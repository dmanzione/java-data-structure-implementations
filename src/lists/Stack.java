package lists;

public class Stack<E> {

	boolean isEmpty = true;
	int size = 0;
	Node top;

	// Parameterless constructor
	Stack() {

	}

	// Constructor with parameters
	Stack(E data) {
		top = new Node(data);
		isEmpty = false;
		size++;
	}

	public void push(E data) {
		Node newNode = new Node(data);

		if (isEmpty) {
			top = newNode;

			isEmpty = false;
		} else {
			top.next = newNode;
			newNode.previous = top;
			top = newNode;

		}

		size++;
	}

	public E pop() throws EmptyDataStructureException {
		if (isEmpty) {
			throw new EmptyDataStructureException("Stack");
		} else {
			E result = top.data;
			if (size == 1) {

				top = null;
				isEmpty = true;
				size = 0;

			} else {

				top = top.previous;
				top.next = null;
				size--;
			}
			return result;
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

	private class Node {
		E data;
		Node next;
		Node previous;

		Node(E data) {
			this.data = data;
		}

	}
}
