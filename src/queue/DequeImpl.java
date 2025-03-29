package queue;

public class DequeImpl {

	public static void main(String[] args) {
		
		Deque dQ = new Deque();
		
		dQ.addFront(2);
		dQ.addFront(4);
		dQ.addFront(5);
		dQ.addLast(9);
		dQ.addLast(8);
		
		dQ.printDeque();
	}

}
