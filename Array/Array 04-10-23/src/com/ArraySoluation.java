package com;

import java.util.Scanner;

public class ArraySoluation {

	int[] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the element");

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
		
	}

	public void display(int[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}
	
//	Count how many negative or positive number

	public int[] neagPos(int[] s) {
		int neg=0,pos=0;
		for (int i = 0; i < s.length; i++) {
			if(s[i]>=0)
				pos++;
			else {
				neg++;
			}
			
		}
		int[] a = {neg,pos};
		return a;
	}
	
//	Sum of Odd and Even number in an Array

	public int[] sumOfOddEven(int[] s) {
		int evensum=0,oddsum=0;
		for (int i = 0; i < s.length; i++) {
			if(s[i]%2==0)
				evensum+=s[i];
			else
				oddsum+=s[i];		
		}
		int[] a = {evensum,oddsum};
		return a;
	}
	
//	 Count the Palindrom number in the array

	public int countPalindrom(int[] s) {
		int count=0;
		for (int i = 0; i < s.length; i++) {
			if(isPalin(s[i]))
				count++;
				
		}
		return count;
	}

	private boolean isPalin(int i) {
		int sum=0,temp=i;
		do {
			int r=i%10;
			sum=sum*10+r;
			i/=10;
		}while(i!=0);
		return sum==temp ;
	}
	
	// Create the reverse the array

	public void reverseArray(int[] s) {
		
		for (int i = s.length-1; i>=0; i--) {
			System.out.println(s[i]);
			
		}
		
	}
	
	// create the copy of an array

	public void copy(int[] s) {
		int[]b = new int[s.length];
		b=s;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}
