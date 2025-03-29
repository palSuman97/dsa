package queue;

public class PriorityQ_LL_Impl {

	public static void main(String[] args) {
		
		PriorityQ_LL pQ_LL = new PriorityQ_LL();
		
		pQ_LL.enQ(1, 10);
		pQ_LL.enQ(12, 5);
		pQ_LL.enQ(11, 15);
		//pQ_LL.dQ();
		pQ_LL.enQ(18, 12);
		pQ_LL.enQ(20, 10);
		pQ_LL.dQ();
		pQ_LL.dQ();
		pQ_LL.dQ();
		pQ_LL.enQ(21, 10);
		
		
		pQ_LL.printQ();
		//System.out.println(pQ_LL.peek());
	}

}
