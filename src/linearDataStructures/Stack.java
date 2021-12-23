package linearDataStructures;

import exceptions.EmptyDataStructureException;

public class Stack<E> {

	private boolean isEmpty = true;
	private int size = 0;
	private Node top;

	public void push(E data) {
		Node newNode = new Node(data);

		if (!isEmpty) {

			top.next = newNode;
			newNode.previous = top;
		}

		top = newNode;

		// Update size
		setSize(size + 1);
	}

	public E pop() throws EmptyDataStructureException {
		if (isEmpty) {
			throw new EmptyDataStructureException("Stack", "pop");
		} else {
			E poppedVal = top.data;
			if (size == 1) {

				top = null;

			} else {

				top = top.previous;
				top.next = null;

			}
			// Update size
			setSize(size - 1);

			return poppedVal;
		}
	}

	public E peek() throws EmptyDataStructureException {
		if (isEmpty)
			throw new EmptyDataStructureException("Stack", "peek");
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

	@Override
	public String toString() {
		if (isEmpty) {
			return "Stack []";
		}
		Stack<E> tempStack = new Stack();
		Node traversalNode = top;
		tempStack.push(traversalNode.data);
		while (traversalNode.previous != null) {
			traversalNode = traversalNode.previous;
			tempStack.push(traversalNode.data);

		}
		String stackString = "";
		while (!tempStack.isEmpty) {
			if (tempStack.getSize() == getSize()) {
				try {
					stackString += tempStack.pop();
				} catch (EmptyDataStructureException e) {
					System.out.println(e);
				}
			}
			try {

				stackString += " ^ " + tempStack.pop();
			} catch (EmptyDataStructureException e) {

				e.printStackTrace();
			}
		}
		stackString = "Stack [" + stackString + "]";

		return stackString;

	}

	private class Node {
		E data;
		Node next;
		Node previous;

		Node(E data) {
			this.data = data;
		}

	}

	public void print() {
		System.out.println(this);

	}
}
