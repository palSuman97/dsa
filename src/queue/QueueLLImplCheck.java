package queue;

public class QueueLLImplCheck {

	public static void main(String[] args) {
		
		QueueLL<Integer> qLl = new QueueLL<>();
		
		qLl.add(1);
		qLl.add(2);
		qLl.add(3);
		qLl.add(4);
		qLl.remove();
		qLl.remove();
		
		qLl.printQ();

	}

}
