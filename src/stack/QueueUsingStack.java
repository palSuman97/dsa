package stack;

import java.util.Stack;

public class QueueUsingStack<T> {
	Stack<T> s1;
	Stack<T> s2;
	
	public QueueUsingStack() {
		this.s1 = new Stack<>();
		this.s2 = new Stack<>();
	}
	
	void add(T data) {
		s1.add(data);
	}
	
	T peek() {
		if(!s2.isEmpty())
			return s2.peek();
		else {
			while(!s1.isEmpty()) {
				s2.add(s1.pop());
			}
			return s2.peek();
		}
	}
	
	void remove() {
		if(!s2.isEmpty())
			s2.pop();
		else {
			while(!s1.isEmpty()) {
				s2.add(s1.pop());
			}
			s2.pop();
		}
	}
	
}
