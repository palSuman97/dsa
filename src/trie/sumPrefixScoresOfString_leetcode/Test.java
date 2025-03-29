package trie.sumPrefixScoresOfString_leetcode;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		String[] a = new String[] {"abcd"};
		Trie trie = new Trie();
		
		for(String str : a) {
			trie.insert(str);
		}
		
		int[] res = new int[a.length];
		int i=0;
		
		for(String str : a) {
			res[i++] = trie.findPrefixSum(str);
		}
		
		System.out.println(Arrays.toString(res));
	}

}
