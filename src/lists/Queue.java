package lists;

public class Queue<E> {
	Node first;
	Node last;
	boolean isEmpty = true;
	int size = 0;
	
	
	//Constructor with parameter
	Queue(E data){
		first = last = new Node(data);
		size++;
		isEmpty=false;
	}
	
	
	
	//Parameterless constructor
	Queue(){
		
	}
	
	
	private class Node{
		E data;
		Node next;
		Node(E data){
			this.data = data;
		}
		

	}
}
