package trie.sumPrefixScoresOfString_leetcode;

public class Node {
	Node[] links;
	int  count;
	
	public Node() {
		this.links = new Node[26];
		this.count = 0;
	}

	public boolean contains(char ch) {
		
		return links[ch-'a']!=null;
	}
}
