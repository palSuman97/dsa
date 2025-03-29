package trie;

public class TrieUseCases {

	public static void main(String[] args) {
		
		Trie trie = new Trie();
		
		String[] a = new String[] {"apple","banana","ba","app","cc"};
		for(String str : a) {
			trie.insert(str);
		}
		
		System.out.println(trie.search("a"));
	}

}
