
/*
add(element): Adds an element to the rear of the queue. If the queue is full, it throws an exception.
offer(element): Adds an element to the rear of the queue. If the queue is full, it returns false.
remove(): Removes and returns the element at the front of the queue. If the queue is empty, it throws an exception.
poll(): Removes and returns the element at the front of the queue. If the queue is empty, it returns null.
element(): Returns the element at the front of the queue without removing it. If the queue is empty, it throws an exception.
peek(): Returns the element at the front of the queue without removing it. If the queue is empty, it returns null.
 */

package queue;

import java.util.LinkedList;
import java.util.List;

public class QueueLL <E>{

	List<E> ls;
	
	public QueueLL() {
		this.ls = new LinkedList<>();
	}
	
	public void add(E element) {
		ls.add(element);
	}
	
	public void remove() {
		ls.remove(0);
	}
	
	public E peak() {
		if(!ls.isEmpty())
			return ls.get(0);
		return null;
	}
	
	public void printQ() {
		for(int i=0;i<ls.size();i++)
			System.out.print(ls.get(i)+"->");
	}
}
