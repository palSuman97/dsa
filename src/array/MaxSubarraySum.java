package array;

import java.util.Arrays;
import java.util.List;

public class MaxSubarraySum {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(-2,-3,4,-1,-2,1,5,-3);
		int length = ls.size();
		int maxSum = Integer.MIN_VALUE, subarraySum=0;
		
		// naive approach
		/*for(int i=0;i<length;i++) {
			subarraySum = 0;
			for(int j=i;j<length;j++) {
				subarraySum+=ls.get(j);
				if(subarraySum>maxSum)
					maxSum=subarraySum;
			}
		}*/
		
		// intuition -> no need to forward negative number because it will decrease the maxSum then.
		for(int i=0;i<length;i++) {
			subarraySum+=ls.get(i);
			if(subarraySum>maxSum)
				maxSum=subarraySum;
			if(subarraySum<0)
				subarraySum=0;
		}
		
		System.out.println(maxSum);
	}

}
