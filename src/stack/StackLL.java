package stack;

import java.util.LinkedList;
import java.util.List;

public class StackLL<T> {

	List<T> ls;
	int peek;
	
	public StackLL() {
		this.ls = new LinkedList<>();
		this.peek = -1;
	}
	
	public void push(T data) {
		ls.add(data);
		peek++;
	}
	
	public void pop() {
		if(peek>-1) {
			ls.remove(peek);
			peek--;	
		}
		else {
			System.out.println("no element");
		}
	}
	
	public void getPeekData() {
		if (peek<0) {
			System.out.println("No Element");
		}
		else {
			System.out.println(ls.get(peek));
		}
	}
	
}
