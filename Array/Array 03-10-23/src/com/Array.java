package com;

import java.util.Scanner;

class Array {

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

		disArray(a);
	}

	static void disArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(i<a.length-1)
				System.out.print(a[i]+",");
			else
				System.out.print(a[i]);
		}

	}

}
