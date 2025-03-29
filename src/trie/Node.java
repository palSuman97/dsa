package trie;

public class Node {

	Node[] links;
	boolean isEnd;
	
	public Node() {
		this.links = new Node[26];
		this.isEnd = false;
	}

	boolean contains(char ch) {
		return links[ch-'a']!=null;
	}
	
	Node getChild(char ch) {
		return links[ch-'a'];
	}
}
