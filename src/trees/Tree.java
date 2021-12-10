package trees;

public class Tree {
	Node root;

	public Tree() {

	}

	
	class Node<E> {
		E data;
		Node[] children;

		Node(E data) {

			this.data = data;

		}

	}
}
