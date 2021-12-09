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
		size--;
		return result;
	}

	public void add(E data) {
		Node newNode = new Node(data);
		if (isEmpty) {
			first = last = new Node(data);
			size++;
			isEmpty = false;
		} else if (size == 1) {

			first.next = last;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;

		}

	}

	private class Node {
		E data;
		Node next;

		Node(E data) {
			this.data = data;
		}

	}
}
