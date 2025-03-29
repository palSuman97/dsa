package linkedlist.singlyll;

public class ReverseLL {

	public static void main(String[] args) {
		
		CustomLinkedList<Integer> ll = new CustomLinkedList<>();
		ll.insertLast(0);
		ll.insertLast(1);
		ll.insertLast(2);
		ll.insertLast(4);
		ll.insertLast(3);
		ll.insertFirst(9);
		ll.printLL();
		
		Node<Integer> dummyHead = ll.dummyHead;	
		Node<Integer> prev = null, curr = dummyHead.next, nxt = null;
		
		if(curr != null)
			nxt = curr.next;
		
		while(curr != null) {
			curr.next = null;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            if(curr != null)
                nxt = curr.next;
		}
		
		dummyHead.next = prev;
		System.out.println();
		ll.printLL();
	}

}
