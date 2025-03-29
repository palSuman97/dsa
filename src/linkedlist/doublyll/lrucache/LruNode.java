package linkedlist.doublyll.lrucache;

public class LruNode<T,V> {
	T key;
	V value;
	LruNode<T,V> prev;
	LruNode<T,V> next;
	
	public LruNode(T key, V value) {
		this.key = key;
		this.value = value;
		this.prev = null;
		this.next = null;
	}

	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}
