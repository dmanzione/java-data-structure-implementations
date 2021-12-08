package lists;

public class Main {

	public static void main(String[] args) {

		SinglyLinkedList<String> singlyList = new SinglyLinkedList<String>("First Element");

		singlyList.addNode("hi");
		singlyList.addNode("hello");
		System.out.println(singlyList);

		SinglyLinkedList<Integer> singlyList2 = new SinglyLinkedList<>(12312);
		singlyList2.addNode(23);
		singlyList2.addNode(234324);
		System.out.println(singlyList2);

	}

}
