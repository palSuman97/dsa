package trie.sumPrefixScoresOfString_leetcode;

public class Trie {
	Node head;
		
	public Trie() {
		this.head = new Node();
	}

	public void insert(String str) {
		Node cur = head;
		int len = str.length();
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			if(cur.contains(ch)) {
				cur = cur.links[ch-'a'];
				cur.count+=1;
			}
			else {
				Node newNode = new Node();
				newNode.count+=1;
				cur.links[ch-'a'] = newNode;
				cur = newNode;		
			}
		}	
	}

	public int findPrefixSum(String str) {
		
		int len = str.length();
		Node cur = head;
		int prefixSum = 0;
		for(int i=0;i<len;i++) {
			char ch = str.charAt(i);
			prefixSum+= cur.links[ch-'a'].count;
			cur = cur.links[ch-'a'];
		}
		
		return prefixSum;
	}
	
	
}
