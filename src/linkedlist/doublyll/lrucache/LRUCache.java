package linkedlist.doublyll.lrucache;

import java.util.HashMap;
import java.util.Map;

import linkedlist.doublyll.CustomDoublyLL;

public class LRUCache {

	CustomDoublyLL<Integer> dll;
	Map<Integer, Integer> hm;
	int dllSize;
	int capacity;
	
	public LRUCache(int capacity) {
		this.dll = new CustomDoublyLL<>();
		this.hm = new HashMap<>();
		this.dllSize = 0;
		this.capacity = capacity;
	}
	
	public int get(int key) {
		
		if(hm.containsKey(key)) {
			if(dll.getTail() != null && dll.getTail().getData() != key) {
    			dll.remove(key);
    			dll.insertEnd(key);
    		}
			return hm.get(key);
		}
			
		return -1;
    }
	//[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
    public void put(Integer key, Integer value) {
        
    	if(hm.containsKey(key)) {
    		hm.put(key, value);
    		if(dll.getTail() != null && dll.getTail().getData() != key) {
    			dll.remove(key);
    			dll.insertEnd(key);
    		}
    	}
    	else {
			if(dllSize < capacity) {
				hm.put(key, value);
				dll.insertEnd(key);
				dllSize++;
			}
			else {
				hm.remove(dll.getHead().getData());
				hm.put(key, value);
				dll.removeAt(1);
				dll.insertEnd(key);			
			}
		}
//    	System.out.println("hm");
//    	hm.forEach((x,y)-> System.out.print(x+" "+y+", "));
//    	System.out.println("dll");
//    	dll.forwardTraversal();
    }
}