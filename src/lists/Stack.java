package lists;

public class Stack<E> {
	
	boolean isEmpty = true;
	int size = 0;
	Node top;
	
	// Parameterless constructor
	Stack() {
		
	}

	// Constructor with parameters
	Stack(E data){
		top = new Node(data);
		isEmpty = false;
		size++;
	}

	public void push(E data) {
		Node newNode = new Node(data);
		if(isEmpty) {
			top = newNode;
		}else {
			top.next = newNode;
			top = newNode;
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
