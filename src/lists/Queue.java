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

	// Deletion operation. Removes first element
	public E remove() throws EmptyDataStructureException {
		if (isEmpty) {
			throw new EmptyDataStructureException("Queue");
		}

		E result = first.data;

		if (size == 1) {
			first = last = null;
			isEmpty=true;
			size--;
		} else {
			
			first = first.next;
			size--;
		}
		
		return result;
	}

	// Insertion operation. Inserts element at top
	public void add(E data) {
		Node newNode = new Node(data);
		if (isEmpty) {
			first = last = new Node(data);
			size++;
			isEmpty = false;
		} else if (size == 1) {
			last = newNode;
			size++;
			first.next = last;

		} else {
			last.next = newNode;
			last = newNode;
			size++;
		}

	}

	// Peek operation. Returns last element

	public E peek() throws EmptyDataStructureException {
		if (isEmpty)
			throw new EmptyDataStructureException("Queue");
		return last.data;
	}
	
	// Get size operation
	public int getSize() {
		return size;
	}

	// Node nested class
	private class Node {
		E data;
		Node next;

		Node(E data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return String.valueOf(data);
		}

	}

}
