package queue;

public class PriorityQ_LL {
	
	Node head;
	
	static class Node {
		int data;
		int priority;
		Node next;
		
		public Node(int data, int priority) {
			this.data = data;
			this.priority = priority;
			this.next = null;
		}
	}
	
	
	public PriorityQ_LL() {
		this.head = null;
	}
	
	void enQ(int data, int priority) {
		Node newNode = new Node(data, priority);
		
		if(head == null)
			head = newNode;
		else {
			Node temp = head;
			Node prev = new Node(0, 0);
			prev.next = temp;
			if(temp.priority > newNode.priority) {
				while(temp != null && temp.priority > newNode.priority) {
					temp = temp.next;
					prev = prev.next;
				}
				prev.next = newNode;
				newNode.next = temp;
			}
			else {
				System.out.println("--");
				newNode.next = head;
				head = newNode;
			}
		}
	}
	
	void dQ() {
		if(head != null) {
			head = head.next;
		}
	}
	
	Integer peek() {	
		if(head != null) {
			return head.data;
		}	
		return null;
	}
	
	void printQ() {
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}		
	}
}
