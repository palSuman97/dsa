package string;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] strs = new String[] {"flower","flow","flight"};
		Arrays.sort(strs);
		
		String res = "";
		
		for(int i=0;i<strs[0].length();i++) {
			if(strs[0].charAt(i)==strs[strs.length-1].charAt(i))
				res+=strs[0].charAt(i);
			else
				break;
		}
		
		System.out.println(res);
	}

}
