package dataStructures;

public class Main {

	public static void main(String[] args) throws EmptyDataStructureException, NoSuchElementException {

		// LINKED LIST TESTS

		// Check creation of list with parameter
		SinglyLinkedList<String> singlyList = new SinglyLinkedList<String>();

		// Check addition of new elements to list
		singlyList.add("hi");
		singlyList.add("hello");
		singlyList.add("ciao");
		singlyList.print();

		// Check creation of list without parameters and addition of elements to said
		// list

		SinglyLinkedList<Integer> singlyList2 = new SinglyLinkedList<>();
		singlyList2.add(23);
		singlyList2.add(234324);
		singlyList2.print();

		// Test element removal when there are 2 or more elements and element is in list
		singlyList.remove("hi");
		singlyList.print();

		// Test element removal when there are 2 or more elements and element is NOT in
		// list
//		singlyList.remove("hallo");
//		singlyList.print();

//		singlyList.remove("Hello");
//		singlyList.print();

		// Test removal when there is one element and element is not in list
//		singlyList.remove("any");

		// Test removal of element when it is the only element in the list
		singlyList.remove("ciao");
		singlyList.print();

		// Test element removal when the list is empty
//		singlyList.remove("any");
//		singlyList.print();

		// STACK TESTS

		Stack<String> stack = new Stack<>();
		stack.push("Hello");
		stack.push("Hi");
		stack.push("Ciao");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		Stack<Long> stack1 = new Stack<>();
		stack1.push(423423l);
		stack1.push(423l);
		stack1.push(4234l);

		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
//		System.out.println(stack1.pop());

		// QUEUE TESTS

		// Insertion operations.
		Queue<String> queue = new Queue<>();

		queue.add("Hello");
		System.out.println(queue.peek());
		queue.add("Hi");
		System.out.println(queue.peek());
		queue.add("Ciao");
		System.out.println(queue.peek());

		// Removal operations
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
//		System.out.println(queue.remove());

	}

}
