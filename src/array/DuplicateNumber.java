package array;

class DuplicateNumber {
  
	public static void main(String[] args) {
		
		int[] a = new int[] {1,3,3,3};
		
		int slow = 0;
		int fast = 0;
		
		do {
			slow = a[slow];
			fast = a[a[fast]];
		} while (slow != fast);
		
		fast = 0;
		
		while (fast != slow) {
			slow = a[slow];
			fast = a[fast];
		}
		
		System.out.println(fast);
		
		/* solved using tortoise hare algorithm. in the 1st loop we are confirming there is a cycle.
		 *  & in the 2nd loop finding the duplicate value.*/
		
	}
}
