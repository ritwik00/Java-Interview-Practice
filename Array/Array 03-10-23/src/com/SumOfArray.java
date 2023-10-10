package com;

import java.util.Scanner;

class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter the element");

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		int s = disArray(a);
		System.out.println("The sum of the element is: "+s);

	}

	static int disArray(int[] a) {
		int sum = a[0];
		
		for(int i=0;i<a.length-1;i++) {
			sum+=a[i];
		}
		return sum;
		
	}

}
