package linkedlist.doublyll.lrucache;

public class CustomDoublyLL<T,V> {
	LruNode<T,V> head;
	LruNode<T,V> tail;
	
	public CustomDoublyLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertFront(T key, V value){
		LruNode<T,V> newNode = new LruNode<>(key,value);
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
	
	public void insertEnd(T key, V value){
		LruNode<T,V> newNode = new LruNode<T,V>(key, value);
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
	
	public void removeAt(int pos) {
		int count = 1;
		LruNode<T,V> temp = head;
		while(count != pos && temp != null) {
			count++;
			temp = temp.next;
		}
		if(temp == null)
			System.out.println("Position : "+ pos +" not Available");
		else {
			LruNode<T,V> prv = temp.prev;
			LruNode<T,V> nxt = temp.next;
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
		
	public void forwardTraversal() {
		if(head == null)
			System.out.println("Empty LL");
		else {
			LruNode<T,V> temp = head;
			while(temp != null) {
				System.out.print(temp.key+"-"+temp.value +"-->");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	public void backwardTraversal() {
		if(tail == null)
			System.out.println("Empty LL");
		else {
			LruNode<T,V> temp = tail;
			while(temp != null) {
				System.out.print(temp.key+"-"+temp.value +"-->");
				temp = temp.prev;
			}
			System.out.println();
		}
	}	
}

