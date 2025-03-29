package queue;

public class CircularQUsingArrayImpl {

	public static void main(String[] args) {
		
		CircularQUsingArray cq = new CircularQUsingArray(5);
		//cq.deQueue();
		cq.enQueue(12);
		cq.enQueue(122);
		cq.enQueue(132);
		cq.enQueue(142);
		cq.enQueue(152);
		cq.enQueue(112);
		cq.deQueue();
		cq.deQueue();
		cq.enQueue(112);
		cq.enQueue(199);
		cq.enQueue(200);
		cq.deQueue();
		cq.enQueue(200);
		cq.printQ();

	}

}

