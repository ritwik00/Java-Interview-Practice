package com;

import java.util.Scanner;

class CountPrimrArray {

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
		System.out.println("The count of prime number is: "+s);

	}

	static int disArray(int[] a) {
		int count=0;

		for(int i=0;i<=a.length/2;i++) {
			if(isPrime(a[i]))
				count++;
		}
		return count;

	}

	private static boolean isPrime(int x) {
		int count=2;
		for(int i=0;i<i/2;i++) {
			if(x%i==0)
				count++;
		}
		return count==2;
	}

}


