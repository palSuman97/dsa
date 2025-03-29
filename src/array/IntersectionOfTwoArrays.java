package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	
	public static int[] intersection(int[] a, int[] b) {
		
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		
		for(int num : a) 
			s1.add(num);
		
		for(int num : b) 
			if(s1.contains(num))
				s2.add(num);
		
		int[] res = new int[s2.size()];
		int i=0;
		for(int num : s2)
			res[i++]=num;
		
		return res;

    }

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,43};
		int[] b = new int[] {11,23,43};
		
		System.out.println(Arrays.toString(intersection(a, b)));
	}

}
