package hierarchicalDataStructures;

import exceptions.EmptyDataStructureException;

public class BinaryTree<E> {
	BinaryTreeNode root;
	boolean isEmpty = true;

	// constructor with parameters
	public BinaryTree(E data) {
		root = new BinaryTreeNode(data);
		isEmpty = false;
	}

	// parameterless constructor
	public BinaryTree() {

	}

	public static void main(String[] args) throws EmptyDataStructureException {

		BinaryTree binarySearchTree = new BinaryTree(4);
		binarySearchTree.root.leftChild = new BinaryTreeNode(2);
		binarySearchTree.root.rightChild = new BinaryTreeNode(6);
		binarySearchTree.root.leftChild.leftChild = new BinaryTreeNode(1);
		binarySearchTree.root.leftChild.rightChild = new BinaryTreeNode(3);
		binarySearchTree.root.rightChild.leftChild = new BinaryTreeNode(5);
		binarySearchTree.root.rightChild.rightChild = new BinaryTreeNode(7);
		binarySearchTree.inOrderTraversalPrint();
		System.out.println("\n");

		BinaryTree minHeap = new BinaryTree(1);
		minHeap.root.leftChild = new BinaryTreeNode(2);
		minHeap.root.rightChild = new BinaryTreeNode(5);
		minHeap.root.leftChild.leftChild = new BinaryTreeNode(3);
		minHeap.root.leftChild.rightChild = new BinaryTreeNode(4);
		minHeap.root.rightChild.leftChild = new BinaryTreeNode(6);
		minHeap.root.rightChild.rightChild = new BinaryTreeNode(7);
		minHeap.preOrderTraversalPrint();
		System.out.println("\n");

		BinaryTree maxHeap = new BinaryTree(7);
		maxHeap.root.leftChild = new BinaryTreeNode(3);
		maxHeap.root.rightChild = new BinaryTreeNode(6);
		maxHeap.root.leftChild.leftChild = new BinaryTreeNode(1);
		maxHeap.root.leftChild.rightChild = new BinaryTreeNode(2);
		maxHeap.root.rightChild.rightChild = new BinaryTreeNode(5);
		maxHeap.root.rightChild.leftChild = new BinaryTreeNode(4);
		maxHeap.postOrderTraversalPrint();
		System.out.println("\n");
	}

	private void postOrderTraversalPrint() {
		BinaryTreeNode.postOrderTraversalPrint(root);

	}

	private void inOrderTraversalPrint() throws EmptyDataStructureException {
		BinaryTreeNode.inOrderTraversalPrint(root);

	}

	private void preOrderTraversalPrint() throws EmptyDataStructureException {
		BinaryTreeNode.preOrderTraversalPrint(root);

	}

	static class BinaryTreeNode<F> {

		BinaryTreeNode leftChild;
		BinaryTreeNode rightChild;
		F data;

		BinaryTreeNode(F data) {
			this.data = data;
			leftChild = rightChild = null;
		}

		public static void postOrderTraversalPrint(BinaryTreeNode node) {

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

		private static void inOrderTraversalPrint(BinaryTreeNode node) throws EmptyDataStructureException {
			if (node != null) {
				if (node.leftChild != null)
					inOrderTraversalPrint(node.leftChild);
				System.out.println(node);
				if (node.rightChild != null)
					inOrderTraversalPrint(node.rightChild);

			}

		}

		private static void preOrderTraversalPrint(BinaryTreeNode node) throws EmptyDataStructureException {
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
