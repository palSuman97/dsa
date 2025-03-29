package linkedlist.doublyll.lrucache;

public class LRUCacheImplementation {

	public static void main(String[] args) {
		
		LRUCache lruCache = new LRUCache(2);
		
		lruCache.put(1, 1);
		lruCache.put(2, 2);
		System.out.println(lruCache.get(1));
		lruCache.put(3, 3);
		System.out.println(lruCache.get(2));
		lruCache.put(4, 4);
		System.out.println(lruCache.get(1));
		System.out.println(lruCache.get(3));
		System.out.println(lruCache.get(4));
		
		
		//[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
		
	}
}
