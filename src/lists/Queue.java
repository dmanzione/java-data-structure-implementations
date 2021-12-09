package lists;

public class Queue<E> {
	private Node first;
	private Node last;
	private boolean isEmpty = true;
	private int size = 0;

	// Constructor with parameter
	Queue(E data) {
		first = last = new Node(data);
		size++;
		isEmpty = false;
	}

	// Parameterless constructor
	Queue() {

	}

	public E remove() throws EmptyDataStructureException {
		if (isEmpty) {
			throw new EmptyDataStructureException("Queue");
		}

		E result = first.data;

		if (size == 1) {
			first = null;

		} else {
			first = first.next;
		}

		return result;
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
