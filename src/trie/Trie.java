package trie;

public class Trie {
	
	Node head;
	
	public Trie() {
		this.head = new Node();
	}

	void insert(String word) {
		Node cur = head;
		for(int i=0;i<word.length();i++) {
			if(cur.contains(word.charAt(i))) {
				cur = cur.getChild(word.charAt(i));
			}
			else {
				Node newChild = new Node();
				cur.links[word.charAt(i)-'a'] = newChild;
				cur = cur.getChild(word.charAt(i));
			}
		}
		cur.isEnd=true;
	}
	
	boolean search(String word) {
		
		Node cur = head;
		for(int i=0;i<word.length();i++) {
			if(cur.contains(word.charAt(i))) {
				cur = cur.getChild(word.charAt(i));
			}
			else {
				return false;
			}
		}
		return cur.isEnd;
	}
		
	boolean isPrefix(String word) {
		
		Node cur = head;
		for(int i=0;i<word.length();i++) {
			if(!cur.contains(word.charAt(i))) {
				return false;
			}
			cur = cur.getChild(word.charAt(i));
		}
		return true;
	}
	
}
