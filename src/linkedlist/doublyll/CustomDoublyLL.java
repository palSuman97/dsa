package linkedlist.doublyll;

public class CustomDoublyLL<T> {
	Node<T> head;
	Node<T> tail;
	
	public CustomDoublyLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertFront(T data){
		Node<T> newNode = new Node<T>(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void insertEnd(T data){
		Node<T> newNode = new Node<T>(data);
		if(tail == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void insertAt(T data, int pos) {
		int count = 1;
		if(pos == 1) {
			insertFront(data);
		}
		Node<T> temp = head;
		while(count != pos-1 && temp != null) {
			temp = temp.next;
			count++;
		}
		Node<T> newNode = new Node<T>(data);
		newNode.next = temp.next;
		temp.next.prev = newNode;
		temp.next = newNode;
		newNode.prev = temp;
	}
	
	public void removeAt(int pos) {
		int count = 1;
		Node<T> temp = head;
		while(count != pos && temp != null) {
			count++;
			temp = temp.next;
		}
		if(temp == null)
			System.out.println("Position : "+ pos +" not Available");
		else {
			Node<T> prv = temp.prev;
			Node<T> nxt = temp.next;
			//System.out.println(prv+" "+nxt);
			temp.next = null;
			temp.prev = null;
			if(prv != null && nxt != null) {				
				prv.next = nxt;
				nxt.prev = prv;
			}
			else if(prv == null && nxt == null) {				
				this.head = null;
				this.tail = null;
			}
			else if(prv == null) {
				nxt.prev = null;
				this.head = nxt;
			}
			else if(nxt == null) {
				prv.next = null;
				this.tail = prv;
			}
		}
	}
	
	public void remove(T data) {
		
		Node<T> temp = head;
		int count = 1;
		while(temp != null) {
			//System.out.println(temp.data);
			if(temp.data == data) {
				Node<T> temp1 = temp.next; 
				removeAt(count);
				temp = temp1;
			}
			else {
				temp = temp.next;
				count++;
			}		
		}	
	}
	
	public void forwardTraversal() {
		if(head == null)
			System.out.println("Empty LL");
		else {
			Node<T> temp = head;
			while(temp != null) {
				System.out.print(temp.data+"->");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	public void backwardTraversal() {
		if(tail == null)
			System.out.println("Empty LL");
		else {
			Node<T> temp = tail;
			while(temp != null) {
				System.out.print(temp.data+"->");
				temp = temp.prev;
			}
			System.out.println();
		}
	}	
	
	public Node<T> getHead() {
		return this.head;
	}
	
	public Node<T> getTail() {
		return this.tail;
	}
}
