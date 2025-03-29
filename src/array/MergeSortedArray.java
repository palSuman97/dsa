package array;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int[] a = new int[] {12,22,31,43,0,0,0};
		int[] b = new int[] {1,4,5};
		
		merge(a,b);
		System.out.println(Arrays.toString(a));
		
	}

	//Naive approach t(n)=O(n2) s(n)=O(1) 
	/*private static void merge(int[] a, int[] b) {
		
		int m = a.length;
		int n = b.length;
		int i=0,k;
		
		while(i<m) {
			if(a[i]>b[0]) {
				swap(a,b,i,0);
				k=0;
				while(k<n-1 && b[k]>b[k+1]) {
					swap(b, k);
					k++;
				}
			}
			i++;
		}
		
		k=0;
		for(int l=m-n;l<m;l++) {
			a[l]=b[k++];
		}	
	}*/
	
	//optimal approach t(n)=O(nlog(n)) s(n)=O(1)
	//Intuition: keep all smaller values in 1st array & bigger values in 2nd array, then sort both & merge them. 
	private static void merge(int[] a, int[] b) {
		int n = b.length;
		int m = a.length-n;
		
		int i=m-1, j=0;
		
		while (i>0 && j<n && a[i]>b[j]) {
			swap(a, b, i, j);
			i--;
			j++;
		}
		
		Arrays.sort(a, 0, m);
		Arrays.sort(b);
		
		int l=m;
		for(int k=0;k<n;k++) {
			a[l++]=b[k];
		}
	}

	private static void swap(int[] b, int k) {
		int temp;
		
		temp=b[k];
		b[k]=b[k+1];
		b[k+1]=temp;
		
	}

	private static void swap(int[] a, int[] b, int i, int j) {		
		int temp;
		
		temp=a[i];
		a[i]=b[j];
		b[j]=temp;
	}

}
