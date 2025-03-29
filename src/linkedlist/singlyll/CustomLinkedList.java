package linkedlist.singlyll;

public class CustomLinkedList<T> {
	
	Node<T> dummyHead;

	public CustomLinkedList() {
		Node<T> dummyHead = new Node<>(null);
		this.dummyHead = dummyHead;
	}
	
	public void insertFirst(T data) {
		Node<T> newNode = new Node<>(data);	
		newNode.next = dummyHead.next;
		dummyHead.next = newNode;
	}
	
	public void insertLast(T data) {
		Node<T> newNode = new Node<>(data);
		Node<T> curr = dummyHead;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	public void insertAt(int index, T data) {
		int i = -1;
		boolean f = false;
		Node<T> curr = dummyHead;
		while (curr != null) {
			if (i == index-1) {
				Node<T> newNode = new Node<>(data);
				newNode.next = curr.next;
				curr.next = newNode;
				f = true;
				break;
			}
			i++;
		}
		if (f == true) 
			System.out.println("Inserted at Index "+ index);
		else 
			System.out.println("Insertion Failed, Index "+ index+ " not Available.");
	}
	
	public void removeAt(int index) {
		int i=-1;
		Node<T> curr = dummyHead;
		while(curr.next != null && i < index-1) {
			curr = curr.next;
			i++;
		}
		if(curr.next != null)
			curr.next = curr.next.next;
		else
			System.out.println("Index := "+ index + " not available");	
	}
	
	public void removeLast() {
		Node<T> curr = dummyHead;
		while(curr.next.next != null) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
	}

	public void remove(T data) {	
		boolean flag = false;
		Node<T> prev = dummyHead;
		Node<T> curr = dummyHead.next;
		while(curr != null) {
			if(curr.value == data) {
				prev.next = curr.next;
				curr.next = null;
				curr = prev.next;
				flag = true;
			} else {
				prev = curr;
				curr = curr.next;
			}
		}
		if(flag == false)
			System.out.println("No data Found");
	}
	
	public Node<T> getLastNode(){
		Node<T> curr = dummyHead;
		
		while(curr.next != null)
			curr = curr.next;
		
		return curr;
	}
	
	public void printLL() {
		Node<T> curr = dummyHead.next;
		while(curr.next != null) {
			System.out.print(curr.value + "->");
			curr = curr.next;
		}
		System.out.print(curr.value);
	}
}
