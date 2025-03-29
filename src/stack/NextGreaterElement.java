
	/*
	Given an array, print the Next Greater Element (NGE) for every element. 
	Note: The Next greater Element for an element x is the first greater element on the right side of x in the array. 
	Elements for which no greater element exist, consider the next greater element as -1. 
	*/

package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		
		int[] a = new int[] {13 , 7, 6 , 12};
		Stack<Integer> stack = new Stack<>();

		int len = a.length;
		
		int[] res = new int[len];
		res[len-1] = -1;
		stack.push(a[len-1]);
		
		for(int i=len-2;i>=0;i--) {
			if(a[i]<stack.peek()) {
				res[i]= stack.peek();
				stack.push(a[i]);
			}
			else {
				while(!stack.isEmpty() && stack.peek()<=a[i])
					stack.pop();
				if (stack.isEmpty()) {
					res[i]=-1;
				}
				else {
					res[i]=stack.peek();
				}
				stack.push(a[i]);
			}
		}
		
		System.out.println(Arrays.toString(res));
		
		
	}

}
