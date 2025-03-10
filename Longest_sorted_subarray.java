package rearrange_arrays;

import java.util.Scanner;

public class Longest_sorted_subarray {
	public static void sortedsubarrays(int[] a) {
		int count=1,max=0,ei=0,si=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]>=a[i]) {
                	count++;
                	}
			else {
				if(count>max) {
					max=count;
					ei=i;
				}
	            count=1;
			}
		}
		if(count>max) {
			max=count;
			ei=a.length-1; //last index 
		}
		si=ei-max+1; //si is starting index
		for(int i=si;i<=ei;i++) {
			System.out.print(a[i]+" ");
			}
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter array size");
		int n = scan.nextInt();
		System.out.println("enter array elements");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		sortedsubarrays(a);		}
	} 


