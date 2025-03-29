package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	static boolean containDuplicate(String str) {
		
		Set<Character> set = new HashSet<>();
		int strLen = str.length();
			
		for(int i=0;i<strLen;i++) {
			set.add(str.charAt(i));
		}
		return strLen != set.size();
	}
	
	
	public static void main(String[] args) {
		
		
		String str = "pwwkew";
		
		//naive approach -- t(n) = O(n^3) , s(n) = O(n)
	/*	int n = str.length();
		String tempString = "";
		int res=1;
		
		for(int i=0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				tempString = str.substring(i, j+1);
				if (!containDuplicate(tempString)) {
					if(j-i+1>res)
						res =j-i+1;
				}
			}
		}
		System.out.println(res);
	*/
		
		//better approach -- t(n) = O(2*n) , s(n) = O(n)
		/*Approach: We will have two pointers left and right. Pointer ‘left’ is used for maintaining the starting point 
		 * of the substring while ‘right’ will maintain the endpoint of the substring.’ right’ pointer will move forward 
		 * and check for the duplicate occurrence of the current element if found then the ‘left’ pointer will be shifted 
		 * ahead so as to delete the duplicate elements.
		 * */
	/*	Set<Character> set = new HashSet<>();
		int l=0, r=0, n = str.length(), len =0;
		
		while(r<n) {
			
			if(!set.contains(str.charAt(r))) {
				if(r-l+1>len)
					len = r-l+1;
				set.add(str.charAt(r));
				r++;
			}
			else {
				set.remove(str.charAt(l));
				l++;
			}
		}
		System.out.println(len);
	*/
		
		//optimized approach -- t(n) = O(n) , s(n) = O(n)
		/*Approach: similar like above, here we are using map to store the latest index of every character & using that to 
		 * by pass the extra traversal of l pointer*/
		Map<Character, Integer> mp = new HashMap<>();
		int l=0, r=0, n = str.length(), len =0;
		
		while(r<n) {
			
			if(!mp.containsKey(str.charAt(r)) ||  !(mp.get(str.charAt(r))>= l && mp.get(str.charAt(r))<r)) {
				if(r-l+1>len)
					len = r-l+1;
				mp.put(str.charAt(r), r);
				r++;
			}
			else {
				l= mp.get(str.charAt(r))+1;
			}	
		}
		System.out.println(len);
	}
}












