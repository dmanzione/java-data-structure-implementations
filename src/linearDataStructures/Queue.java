package linearDataStructures;

import exceptions.EmptyDataStructureException;

public class Queue<E> {
	private Node first;
	private Node last;
	private boolean isEmpty = true;
	private int size = 0;

	public static void main(String[] args) throws EmptyDataStructureException {
//		Insertion operations.
		Queue<String> queue = new Queue<>();

		queue.add("Hello");
		System.out.println(queue.peek());
		queue.add("Hi");
		System.out.println(queue.peek());
		queue.add("Ciao");
		System.out.println(queue.peek());

//		Removal operations
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());

	}

	// Deletion operation. Removes first element
	public E remove() throws EmptyDataStructureException {
		if (isEmpty) {
			throw new EmptyDataStructureException("Queue", "remove");
		}

		E removedVal = first.data;

		if (size == 1) {
			first = last = null;

		} else {

			first = first.next;

		}

		// Update size
		setSize(size - 1);

		return removedVal;
	}

	// Insertion operation. Inserts element at top
	public void add(E data) {
		Node newNode = new Node(data);
		if (isEmpty) {
			first = last = new Node(data);

		} else if (size == 1) {
			last = newNode;

			first.next = last;

		} else {
			last.next = newNode;
			last = newNode;

		}

		// Update size
		setSize(size + 1);

	}

	// Peek operation. Returns last element

	public E peek() throws EmptyDataStructureException {
		if (isEmpty)
			throw new EmptyDataStructureException("Queue", "peek");
		return last.data;
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

	@Override
	public String toString() {

		if (isEmpty) {
			return "Queue []";

		} else {
			String queue = "Queue [";
			Node traversalNode = first;
			queue += traversalNode.data;
			if (size > 1) {
				queue += " -> ";
			}
			while (traversalNode.next != null) {

				traversalNode = traversalNode.next;
				if (traversalNode.next == null) {
					queue += traversalNode.data;
					break;
				} else {
					queue += traversalNode.data + " -> ";
				}
			}
			return queue + "]";
		}
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
