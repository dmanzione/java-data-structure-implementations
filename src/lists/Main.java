package lists;

public class Main {

	public static void main(String[] args) {

		// Check creation of list with parameter
		SinglyLinkedList<String> singlyList = new SinglyLinkedList<String>("First Element");

		// Check addition of new elements to list
		singlyList.add("hi");
		singlyList.add("hello");
		singlyList.add("ciao");
		System.out.println(singlyList);

		// Check creation of list without parameters and addition of elements to said
		// list

		SinglyLinkedList<Integer> singlyList2 = new SinglyLinkedList<>();
		singlyList2.add(23);
		singlyList2.add(234324);
		System.out.println(singlyList2);

		// Test element removal when there are 2 or more elements and element is in list
		singlyList.remove("hi");
		System.out.println(singlyList);

		// Test element removal when there are 2 or more elements and element is NOT in
		// list
		singlyList.remove("hallo");
		System.out.println(singlyList);

		// Test removal of several elements at once
		singlyList.remove("First Element", "ciao", "hi");
		System.out.println(singlyList);

		// Test element removal when the list is empty
		singlyList.remove("any");

		// Test addition of several elements at once
		singlyList.add("First Element", "hi", "hello", "ciao");
		System.out.println(singlyList);
	}

}
