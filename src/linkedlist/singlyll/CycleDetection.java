package linkedlist.singlyll;

public class CycleDetection {
	
	public static boolean hasCycle(Node<Integer> head) {
        
        Node<Integer> temp = head, slow = null, fast =null;
        if(temp != null && temp.next != null) {
            slow = temp.next;
            fast = temp.next.next;
        }

        while(fast != null && fast.next != null) {
            if(slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next; 
        }
        return false;
    }

	public static void main(String[] args) {
		
		CustomLinkedList<Integer> ll = new CustomLinkedList<>();
		ll.insertLast(0);
		ll.insertLast(1);
		ll.insertLast(2);
		ll.insertLast(4);
		ll.insertLast(3);
		ll.insertFirst(9);
		
		Node<Integer> temp = ll.dummyHead;
		while(temp.next != null)
			temp = temp.next;
		
		Node<Integer> last = temp;
		last.next = ll.dummyHead.next.next;
		
		System.out.println(hasCycle(ll.dummyHead));
		
	}

}
