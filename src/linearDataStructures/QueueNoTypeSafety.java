package linearDataStructures;

import exceptions.EmptyDataStructureException;

public class QueueNoTypeSafety {
	private Node<Object> first;
	private Node<Object> last;
	private boolean isEmpty = true;
	private int size = 0;

	// Deletion operation. Removes first element
	public Object remove() throws EmptyDataStructureException {
		if (isEmpty) {
			throw new EmptyDataStructureException("Queue", "remove");
		}

		Object removedVal = first.data;

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
	public void add(Object data) {
		Node<Object> newNode = new Node<Object>(data);
		if (isEmpty) {
			first = last = new Node<Object>(data);

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

	public Object peek() throws EmptyDataStructureException {
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
			return "QueueNoTypeSafety []";

		} else {
			String queue = "QueueNoTypeSafety [";
			Node<Object> traversalNode = first;
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

	public void print() {
		System.out.println(this);
	}

	// Node nested class
	private class Node<F> {
		F data;
		Node next;

		Node(F data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return String.valueOf(data);
		}

	}

}
