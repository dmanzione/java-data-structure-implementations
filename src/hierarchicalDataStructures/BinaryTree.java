package hierarchicalDataStructures;

import exceptions.EmptyDataStructureException;

public class BinaryTree<E> {
	Node root;
	boolean isEmpty = true;

	// constructor with parameters
	public BinaryTree(E data) {
		root = new Node(data);
		isEmpty = false;
	}

	// parameterless constructor
	public BinaryTree() {

	}

	public static void main(String[] args) throws EmptyDataStructureException {

		BinaryTree binarySearchTree = new BinaryTree(4);
		binarySearchTree.root.leftChild = new Node(2);
		binarySearchTree.root.rightChild = new Node(6);
		binarySearchTree.root.leftChild.leftChild = new Node(1);
		binarySearchTree.root.leftChild.rightChild = new Node(3);
		binarySearchTree.root.rightChild.leftChild = new Node(5);
		binarySearchTree.root.rightChild.rightChild = new Node(7);
		binarySearchTree.inOrderTraversalPrint();
		System.out.println("\n");
		
		BinaryTree minHeap = new BinaryTree(1);
		minHeap.root.leftChild = new Node(2);
		minHeap.root.rightChild = new Node(5);
		minHeap.root.leftChild.leftChild = new Node(3);
		minHeap.root.leftChild.rightChild = new Node(4);
		minHeap.root.rightChild.leftChild = new Node(6);
		minHeap.root.rightChild.rightChild = new Node(7);
		minHeap.preOrderTraversalPrint();
		System.out.println("\n");
		
		
		BinaryTree maxHeap = new BinaryTree(7);
		maxHeap.root.leftChild = new Node(3);
		maxHeap.root.rightChild = new Node(6);
		maxHeap.root.leftChild.leftChild = new Node(1);
		maxHeap.root.leftChild.rightChild = new Node(2);
		maxHeap.root.rightChild.rightChild = new Node(5);
		maxHeap.root.rightChild.leftChild = new Node(4);
		maxHeap.postOrderTraversalPrint();
		System.out.println("\n");
	}

	private void postOrderTraversalPrint() {
		Node.postOrderTraversalPrint(root);

	}

	private void inOrderTraversalPrint() throws EmptyDataStructureException {
		Node.inOrderTraversalPrint(root);

	}

	private void preOrderTraversalPrint() throws EmptyDataStructureException {
		Node.preOrderTraversalPrint(root);

	}

	private static class Node<F> {

		Node leftChild;
		Node rightChild;
		F data;

		Node(F data) {
			this.data = data;
			leftChild = rightChild = null;
		}

		public static void postOrderTraversalPrint(Node node) {

			if (node != null) {
				if (node.leftChild != null)
					postOrderTraversalPrint(node.leftChild);
				if (node.rightChild != null)
					postOrderTraversalPrint(node.rightChild);
				System.out.println(node);
			}
		}

		@Override
		public String toString() {
			return String.valueOf(data);
		}

		private static void inOrderTraversalPrint(Node node) throws EmptyDataStructureException {
			if (node != null) {
				if (node.leftChild != null)
					inOrderTraversalPrint(node.leftChild);
				System.out.println(node);
				if (node.rightChild != null)
					inOrderTraversalPrint(node.rightChild);

			}

		}

		private static void preOrderTraversalPrint(Node node) throws EmptyDataStructureException {
			if (node != null) {

				System.out.println(node);
				if (node.leftChild != null)
					inOrderTraversalPrint(node.leftChild);
				if (node.rightChild != null)
					inOrderTraversalPrint(node.rightChild);

			}

		}

	}
}
