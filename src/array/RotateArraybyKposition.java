package array;

import java.util.Arrays;

public class RotateArraybyKposition {
	
	static void reverseArray(int[] a, int st, int end) {
		int temp;
		while(st<end) {
			temp=a[end];
			a[end]=a[st];
			a[st]=temp;
			st++;
			end--;
		}
	}

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5,6,7};	
		int pos = 3;
		int len = a.length;
		int t1, t2;
		
		//t(n)= O(n2) , s(n)= O(1)
		/* 
		for(int i=0;i<pos;i++) {
			t1= a[len-1];
			for(int j=0;j<len;j++) {
				t2 = a[j];
				a[j] = t1;
				t1 = t2;
			}
		}
		*/
		
		//t(n)= O(n) , s(n)= O(n)
		/*
		int[] b =new int[len];	
		for(int i=0;i<len;i++) {
			b[(i+pos)%len]=a[i];
		}
		*/
		int k = pos%len;
		// right rotate
		reverseArray(a, 0, len-k-1);
		reverseArray(a, len-k, len-1);
		reverseArray(a, 0, len-1);
		
		// left rotate
		reverseArray(a, 0, k-1);
		reverseArray(a, k, len-1);
		reverseArray(a, 0, len-1);
		
		// optimal approach comes from observation. 
		
		System.out.print(Arrays.toString(a));
		
	}

}
