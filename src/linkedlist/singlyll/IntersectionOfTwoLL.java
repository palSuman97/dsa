package linkedlist.singlyll;

public class IntersectionOfTwoLL {
	
	public static Node<Integer> getIntersectionNode(Node<Integer> headA, Node<Integer> headB) {
        
        Node<Integer> d1 = headA;
        Node<Integer> d2 = headB;

        while((d1 != null || d2 != null) && (d1 != d2)){

            if(d1 == null){
                d1 = headB;
                continue;
            }
            if(d2 == null){
                d2 = headA;
                continue;
            }

            d1 = d1.next;
            d2 = d2.next;
        }

        if(d1 == d2)
            return d1;
        else
            return null;
    }

	public static void main(String[] args) {
		
		CustomLinkedList<Integer> ll1= new CustomLinkedList<>();
		ll1.insertLast(1);
		ll1.insertLast(2);
		ll1.insertLast(3);
		ll1.insertLast(9);

		CustomLinkedList<Integer> ll2= new CustomLinkedList<>();
		ll2.insertLast(1);
		ll2.insertLast(4);
		ll2.insertLast(7);
		ll2.insertLast(9);
		
		ll2.getLastNode().next = ll1.dummyHead.next.next.next;
		
		System.out.println(getIntersectionNode(ll1.dummyHead.next, ll2.dummyHead.next).value);
	}

}
