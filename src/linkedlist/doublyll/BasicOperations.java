package linkedlist.doublyll;

public class BasicOperations {

	public static void main(String[] args) {
		
		CustomDoublyLL<Integer> dll = new CustomDoublyLL<>();
		dll.insertEnd(1);
		dll.insertEnd(2);
		dll.insertEnd(2);
		dll.insertEnd(3);
		dll.insertEnd(2);
		//dll.insertAt(9, 3);
		dll.removeAt(1);
		//dll.remove(1);
		dll.forwardTraversal();
		dll.backwardTraversal();
	}
}
