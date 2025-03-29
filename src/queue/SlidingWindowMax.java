package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMax {

	public static void main(String[] args) {
		
		int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int len = nums.length;
		
		Deque<Integer> dq = new ArrayDeque<>();
		
		for(int i=0;i<len;i++) {
			
			if(i>k-1 && dq.getFirst()<=i-k)
				dq.removeFirst();
			
			if(dq.isEmpty())
				dq.add(i);
			else if (nums[i]<nums[dq.getLast()]) {
				dq.add(i);
			}
			else {
				while(!dq.isEmpty() && nums[i]>nums[dq.getLast()]) {
					dq.removeLast();
//					if(!dq.isEmpty())
//						System.out.println("dq-last "+dq.getLast());
				}
				dq.addLast(i);
			}
//			System.out.print("dq ");
//			dq.stream().forEach(e->System.out.print(e+" "));
//			System.out.println();
			
			if(i>=k-1)
				System.out.print(nums[dq.getFirst()]+" ");
		}
	}

}
