package string;

public class FindFirstOccurrence {

	public static void main(String[] args) {
		
		String haystack = "sadbutsad", needle = "sd";
		System.out.println(strStr(haystack, needle));
	}
	
	public static int strStr(String haystack, String needle) {
		
		int m=haystack.length();
		int n=needle.length();
		int j,k;
		
		for(int i=0;i<=m-n;i++) {
			j=i;
			k=0;
			while(haystack.charAt(j)==needle.charAt(k)) {
				j++;
				k++;	
				if(k==n)
					return i;
			}
		}	
		return -1;
    }

	// t(n)=O(n)& s(n)=O(1)
}
