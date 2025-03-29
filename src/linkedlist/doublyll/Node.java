package linkedlist.doublyll;

public class Node<T> {
	
	T data;
	Node<T> prev;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	
	public Node<T> getPrev() {
		return this.prev;
	}
	
	public Node<T> getNext() {
		return this.next;
	}
	
	public T getData() {
		return this.data;
	}
	
	public void setData(T data) {
		this.data = data;
	}

	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
