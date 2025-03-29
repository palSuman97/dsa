package linkedlist.singlyll;

public class MergeSortedLL {
	
	public static Node<Integer> mergeTwoLists(Node<Integer> list1, Node<Integer> list2) {
        
		Node<Integer> result = new Node<Integer>(null);
		Node<Integer> temp = result;
		
        if(list1 == null && list2 == null)
            return null;
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;

        while(list1 != null && list2 != null){
            if(list1.value <= list2.value){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null)
            temp.next = list1; 

        if(list2 != null)
            temp.next = list2; 

        return result.next;
    }


	public static void main(String[] args) {
		
		CustomLinkedList<Integer> ll1= new CustomLinkedList<>();
		ll1.insertLast(1);
		ll1.insertLast(2);
		ll1.insertLast(3);
		ll1.insertLast(9);
		//ll1.printLL();
		//System.out.println();
		
		CustomLinkedList<Integer> ll2= new CustomLinkedList<>();
		ll2.insertLast(1);
		ll2.insertLast(4);
		ll2.insertLast(7);
		ll2.insertLast(9);
		//ll2.printLL();
		
		Node<Integer> result = mergeTwoLists(ll1.dummyHead.next, ll2.dummyHead.next);
		
		while(result != null) {
			System.out.print(result.value+" -> ");
			result = result.next;
		}
			
	}

}
