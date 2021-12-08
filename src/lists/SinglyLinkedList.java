package lists;

public class SinglyLinkedList<E> {
	Node<E> head;
	
	SinglyLinkedList(){
		
	}
	SinglyLinkedList(E data){
		head = new Node<E>(data);
	}
}

class Node<E> {
	Node(E data){
		this.data = data;
	}
	E data;
	Node<E> next;
}
