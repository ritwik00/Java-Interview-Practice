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
			System.out.print(s[i]+" ");
		}

	}
	public int readElement() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();

		return n;
	}


	//frequency of an element of an Array
	public int getFrequency(int[] ar, int ele) {
		int count=1;
		for (int j = 0; j < ar.length; j++) {
			if (ele==ar[j]) {
				count++;
			}
		}
		return count;
	}

	
	//Unique element 
	public void uniqueArray(int[] ar) {
		
		for ( int j = 0; j < ar.length; j++) {
			int i;
			for (i = 0; i < ar.length; i++) {
				if(ar[j]==ar[i]) {
					break;
				}
			}
			if(j==i)
				System.out.println("The unique elements are "+ar[j]);
		}
		
		
		
	}
	
	//Duplicate Element

	public void duplicateElement(int[] ar) {
	
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]==ar[j])
					System.out.println("Duplicate elements are: "+ar[i]);
			}
		}
		
	}
	
	//Common elements of TWo Array

	public void commonElement(int[] ar, int[] ar1) {

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar1.length; j++) {
				if(ar[i]==ar1[j])
					System.out.println("Common elements are: "+ar[i]);
			}
		}
		
	}
	
}

