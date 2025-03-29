package queue;

import java.util.LinkedList;
import java.util.List;

public class Deque {

	List<Integer> ls;
	
	public Deque() {
		this.ls = new LinkedList<>();
	}
	
	void addFront(Integer data) {
		ls.add(0, data);
	}
	
	void addLast(Integer data) {
		ls.add(ls.size(), data);
	}
	
	void removeFront() {
		ls.remove(0);
	}
	
	void removeRear() {
		ls.remove(ls.size()-1);
	}
	
	boolean isEmpty() {
		return ls.isEmpty();
	}
	
	Integer getFront() {
		return ls.get(0);
	}
	
	Integer getRear() {
		return ls.get(ls.size()-1);
	}
	
	void printDeque() {
		ls.stream().forEach(e->System.out.print(e+" "));
	}
	
	
}
