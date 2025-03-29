package linkedlist.singlyll;


public class Node<T> {
	T value;
    Node<T> next;
    
    Node(T value) { 
    	this.value = value; 
    	this.next = null;
    }
}
 
